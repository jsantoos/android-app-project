//package com.example.carrent.ui.alugar;
//
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.example.carrent.R;
//
//import java.util.List;
//import androidx.recyclerview.widget.RecyclerView;
//
//
//public class AlugarFragment extends Fragment {
//
//    private List<Car> availableCars; // Lista de carros disponíveis para aluguel
//
//    public AlugarFragment() {
//        // Required empty public constructor
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_alugar, container, false);
//
//        // Obtenha a referência para a RecyclerView no layout
//        RecyclerView recyclerView = view.findViewById(R.id.carRecyclerView);
//
//        // Crie a lista de carros disponíveis (dados mockados)
//        availableCars = createMockCarList();
//
//        // Crie e defina o adaptador para a RecyclerView
//        CarAdapter carAdapter = new CarAdapter(availableCars);
//        recyclerView.setAdapter(carAdapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//
//        // Defina um ouvinte de clique para os itens da lista
//        carAdapter.setOnItemClickListener(new CarAdapter.OnItemClickListener() {
//            @Override
//            public void onItemClick(int position) {
//                // Carro selecionado pelo usuário
//                Car selectedCar = availableCars.get(position);
//
//                // Prossiga com a lógica de solicitar detalhes de aluguel
//                showRentalDetailsForm(selectedCar);
//            }
//        });
//
//        return view;
//    }
//
//    private List<Car> createMockCarList() {
//        List<Car> carList = new ArrayList<>();
//
//        // Dados mockados para carros disponíveis
//        carList.add(new Car("Carro 1", "Modelo 1", "R$100/dia", R.drawable.car1));
//        carList.add(new Car("Carro 2", "Modelo 2", "R$120/dia", R.drawable.car2));
//        carList.add(new Car("Carro 3", "Modelo 3", "R$90/dia", R.drawable.car3));
//        // Adicione mais carros mockados conforme necessário
//
//        return carList;
//    }
//
//    private void showRentalDetailsForm(Car selectedCar) {
//        // Implemente a lógica para exibir a tela/formulário de detalhes do aluguel
//        // Isso pode ser feito usando um DialogFragment ou uma nova atividade
//        // Passe o objeto Car selecionado para a tela/formulário para exibir as informações relevantes do carro
//    }
//}