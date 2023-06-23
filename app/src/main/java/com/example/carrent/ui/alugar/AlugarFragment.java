package com.example.carrent.ui.alugar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.carrent.R;

import java.util.ArrayList;
import java.util.List;

public class AlugarFragment extends Fragment {

    private List<Car> carList;

    public AlugarFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alugar, container, false);

        carList = createMockCarList();

        TextView carTextView = view.findViewById(R.id.carTextView);
        StringBuilder carDetails = new StringBuilder();

        for (Car car : carList) {
            carDetails.append("Name: ").append(car.getName()).append("\n");
            carDetails.append("Brand: ").append(car.getBrand()).append("\n");
            carDetails.append("Price: ").append(car.getPrice()).append("\n\n");
        }

        carTextView.setText(carDetails.toString());

        return view;
    }

    private List<Car> createMockCarList() {
        List<Car> carList = new ArrayList<>();

        // Mock car data
        Car car1 = new Car("Car 1", "Brand 1", "$100/day");
        Car car2 = new Car("Car 2", "Brand 2", "$150/day");

        // Add cars to the list
        carList.add(car1);
        carList.add(car2);

        return carList;
    }

    private static class Car {
        private String name;
        private String brand;
        private String price;

        public Car(String name, String brand, String price) {
            this.name = name;
            this.brand = brand;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getBrand() {
            return brand;
        }

        public String getPrice() {
            return price;
        }
    }
}
