package com.aau.student.meab220.snacktrack;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.aau.student.meab220.snacktrack.Snack.CSVFileReaderFavorites;
import com.aau.student.meab220.snacktrack.Snack.SaveDataInputToCSV;
import com.aau.student.meab220.snacktrack.Snack.SaveFavoriteToCSV;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;



public class SnackSubCategory extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences sPref;
    LinearLayout linearLayout;
    Button[] button;
    View.OnClickListener listener;

    private static String snackScreenChosen;
    private static String button_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        buttonGenerator();

    }

    public void buttonGenerator(){
        if(snackScreenChosen=="favorites") {
            linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

            File file = new File(Environment.getExternalStorageDirectory().getAbsoluteFile(), "test2.csv");
            FileInputStream inputStream = null;
            try {
                inputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            CSVFileReaderFavorites csvFile = new CSVFileReaderFavorites(inputStream);
            List<String> scoreList = csvFile.read();
            String[] array = scoreList.toArray(new String[0]);
            //drawing the buttons based on the csv file as a string array above
            int length = array.length;
            button = new Button[length];

            for (int i = 0; i < length; i++) {
                button[i] = new Button(getApplicationContext());
                button[i].setId(i);
                button[i].setTag(array[i]);
                button[i].setBackgroundResource(R.drawable.button_subcategory);
                button[i].setTextColor(Color.parseColor("#000000"));
                button[i].setText(array[i]);
                button[i].setOnClickListener(this);
                linearLayout.addView(button[i]);
            }
        }
        if(snackScreenChosen=="drink") {
            linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

            String[] array = {"Apple juice", "Beer", "Carbonated water", "Carrot juice", "Champagne", "Coffee(instant)", "Coffee(Regular)", "Liquor", "Milk", "Milkshake", "Orange juice", "Pineapple juiice", "Protein shake", "Protein shake(Diet)",
                    "Protein shake(Recovery)", "Red wine", "Soft drink with sugar", "Soft drink without sugar", "Tea", "Water", "White wine"};

            int length = array.length;
            button = new Button[length];

            for (int i = 0; i < length; i++) {
                button[i] = new Button(getApplicationContext());
                button[i].setId(i);
                button[i].setTag(array[i]);
                button[i].setBackgroundResource(R.drawable.button_subcategory);
                button[i].setTextColor(Color.parseColor("#000000"));
                button[i].setText(array[i]);
                button[i].setOnClickListener(this);
                linearLayout.addView(button[i]);
            }
        }

        if(snackScreenChosen=="baked") {
            linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

            String[] array = {"Wholemeal Digestive", "Oatmeal", "Rye", "Coarse grain roll", "White roll", "Ryebread", "Cake", "Crisped bread", "White bread", "Wholemeal bread", "Biscuit", "Wheat bread(with sunflower kernels)", "Danish pastry", "Sausage rolls"};

            int length = array.length;
            button = new Button[length];

            for (int i = 0; i < length; i++) {
                button[i] = new Button(getApplicationContext());
                button[i].setId(i);
                button[i].setTag(array[i]);
                button[i].setBackgroundResource(R.drawable.button_subcategory);
                button[i].setTextColor(Color.parseColor("#000000"));
                button[i].setText(array[i]);
                button[i].setOnClickListener(this);
                linearLayout.addView(button[i]);
            }
        }

        if(snackScreenChosen=="fastfood") {
            linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

            String[] array = {"BIG KING(Burger King)", "Big Mac(McDonalds)", "Cheeseburger", "Chicken nuggets(4 piece)", "Chili Cheese Tops(McDonalds)", "Crispy Chicken(Burger King)", "Dipsauce",
                    "Fried spring roll", "Frozen pizza", "Hamburger", "McBacon(McDonalds)", "McChicken(McDonalds)", "McFeast(McDonalds)", "McFlurry(McDonalds)", "Fries", "Milkshake", "Pizza", "Quarter Pounder(McDonalds)",
                    "Steakhouse(Burger King)", "Whopper(Burger King)", "X-Long Hot Chili Cheese(Burger King)"};

            int length = array.length;
            button = new Button[length];

            for (int i = 0; i < length; i++) {
                button[i] = new Button(getApplicationContext());
                button[i].setId(i);
                button[i].setTag(array[i]);
                button[i].setBackgroundResource(R.drawable.button_subcategory);
                button[i].setTextColor(Color.parseColor("#000000"));
                button[i].setText(array[i]);
                button[i].setOnClickListener(this);
                linearLayout.addView(button[i]);
            }
        }

        if(snackScreenChosen=="fruit") {
            linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

            String[] array =  {"Apple", "Apricot", "Apricot(dried)", "Avocado", "Banana", "Blackberry", "Blackcurrant", "Blueberry", "Cantaloupe", "Carembola", "Cherimoya", "Cherry", "Clementine", "Fig", "Fig(dried)",
                    "Cowberry", "Cranberry", "Redcurrant berry", "Date(dried)", "Durian", "Elderberry", "Goji berry(dried)", "Gooseberry", "Grape", "Grapefruit", "Ground cherry", "Honey melon", "Kaki", "Kiwi", "Kumquat", "Lemon", "Lime",
                    "Mango", "Mango(dried)", "Nectarine", "Olives(black)", "Olives(green)", "Orange", "Papaya", "Passion fruit", "Peaches", "Pear", "Pineapple", "Plums", "Pomegranate", "Prune", " Quince", "Raisin", "Raspberry", "Rose hip",
                    "Sea buckthorn", "Strawberry", "Tangerine", "Watermelon"};

            int length = array.length;
            button = new Button[length];

            for (int i = 0; i < length; i++) {
                button[i] = new Button(getApplicationContext());
                button[i].setId(i);
                button[i].setTag(array[i]);
                button[i].setBackgroundResource(R.drawable.button_subcategory);
                button[i].setTextColor(Color.parseColor("#000000"));
                button[i].setText(array[i]);
                button[i].setOnClickListener(this);
                linearLayout.addView(button[i]);
            }
        }


        if(snackScreenChosen=="sweets") {
            linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

            String[] array = {"Haribo candy", "Pingvin blanding(Toms)", "Familie Guf(Malaco)", "Cake", "Chocolate", "Chocolate bisquit", "Chips", "Coarse chips", "Gum(with sugar)", "Marcipan with chocolate", "Liqorice", " Toffee", "Ice cream",
                    "Ice cream(Vanilla cone)", "Floedeboller", "Nougat", "Nutella", "Hard candy",};

            int length = array.length;
            button = new Button[length];

            for (int i = 0; i < length; i++) {
                button[i] = new Button(getApplicationContext());
                button[i].setId(i);
                button[i].setTag(array[i]);
                button[i].setBackgroundResource(R.drawable.button_subcategory);
                button[i].setTextColor(Color.parseColor("#000000"));
                button[i].setText(array[i]);
                button[i].setOnClickListener(this);
                linearLayout.addView(button[i]);
            }
        }

        if(snackScreenChosen=="vegetables") {
            linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

            String[] array = {"Potato", "Carrot", "Broccoli", "Rhubarb", "Iceberg, lettuce", "Spinach", "Pepper(red)", "Pepper(green)", "Tomato", "Cucumber"};

            int length = array.length;
            button = new Button[length];

            for (int i = 0; i < length; i++) {
                button[i] = new Button(getApplicationContext());
                button[i].setId(i);
                button[i].setTag(array[i]);
                button[i].setBackgroundResource(R.drawable.button_subcategory);
                button[i].setTextColor(Color.parseColor("#000000"));
                button[i].setText(array[i]);
                button[i].setOnClickListener(this);
                linearLayout.addView(button[i]);
            }
        }

        if(snackScreenChosen=="nuts") {
            linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

            String[] array = {"Almond", "Brazil nut", "Cashew nut", "Chestnut", "Coconut", "Flax(linseed)", "Hazel nut", "Macadamia", "Peanut(oil)", "Peanut(salt)", "Pecan nut", "Pine nut", "Pistachio", "Pumpkin seeds",
                    "Sesame seeds", "Walnut"};

            int length = array.length;
            button = new Button[length];

            for (int i = 0; i < length; i++) {
                button[i] = new Button(getApplicationContext());
                button[i].setId(i);
                button[i].setTag(array[i]);
                button[i].setBackgroundResource(R.drawable.button_subcategory);
                button[i].setTextColor(Color.parseColor("#000000"));
                button[i].setText(array[i]);
                button[i].setOnClickListener(this);
                linearLayout.addView(button[i]);
            }
        }
    }




    @Override
    public void onClick(View view) {
        view.getId();
        view.getTag();
        Button button=(Button)findViewById(view.getId());
        String button_tag = (String)button.getTag();
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
            switch (button_tag) {

                case "Almond":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("579");
                    SaveDataInputToCSV.setAmount("50 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Brazil nut":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("660");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Cashew nut":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("574");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Chestnut":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("245");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Coconut":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("255");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Flax(linseed)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("535");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Hazel nut":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("628");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Macadamia":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("718");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Peanut(oil)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("599");
                    SaveDataInputToCSV.setAmount("400 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Peanut(salt)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("579");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Pecan nut":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("691");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Pine nut":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("673");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Pistachio":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("560");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Pumpkin seeds":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("574");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Sesame seeds":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("631");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Walnut":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("667");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;
                case "Apple juice":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("141");
                    SaveDataInputToCSV.setAmount("330 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Beer":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("118");
                    SaveDataInputToCSV.setAmount("330 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Carbonated water":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("12");
                    SaveDataInputToCSV.setAmount("300 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Carrot juice":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("135");
                    SaveDataInputToCSV.setAmount("330 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Champagne":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("121");
                    SaveDataInputToCSV.setAmount("150 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Coffee(instant)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("8");
                    SaveDataInputToCSV.setAmount("200 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Coffee(regular)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("2");
                    SaveDataInputToCSV.setAmount("200 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Liquor":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("115");
                    SaveDataInputToCSV.setAmount("50 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Milk":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("20");
                    SaveDataInputToCSV.setAmount("400 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Orange juice":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("170");
                    SaveDataInputToCSV.setAmount("300 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Pineapple juice":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("174");
                    SaveDataInputToCSV.setAmount("300 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Protein shake":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("103");
                    SaveDataInputToCSV.setAmount("25 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Protein shake(diet)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("95");
                    SaveDataInputToCSV.setAmount("25 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Protein shake(recovery)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("97");
                    SaveDataInputToCSV.setAmount("25 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Red wine":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("115");
                    SaveDataInputToCSV.setAmount("150 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Soft drinks with sugar":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("143");
                    SaveDataInputToCSV.setAmount("350 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Soft drinks without sugar":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("14");
                    SaveDataInputToCSV.setAmount("350 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Tea":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("0");
                    SaveDataInputToCSV.setAmount("300 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Water":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("0");
                    SaveDataInputToCSV.setAmount("300 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "White wine":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("123");
                    SaveDataInputToCSV.setAmount("150 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;
                case "BIG KING(Burger King)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("680");
                    SaveDataInputToCSV.setAmount("300 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Big Mac(McDonalds)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("509");
                    SaveDataInputToCSV.setAmount("300 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Cheeseburger":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("304");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Chicken nuggets(4 pieces)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("179");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Chili Cheese tops(McDonalds)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("157");
                    SaveDataInputToCSV.setAmount("30 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Crispy Chicken(Burger King)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("564");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Dipsauce":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("90");
                    SaveDataInputToCSV.setAmount("20 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Fried spring roll":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("24");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Frozen pizza":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("87");
                    SaveDataInputToCSV.setAmount("25 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Hamburger":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("254");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "McBacon(McDonalds)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("445");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "McChicken(McDonalds)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("445");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "McFeast(McDonalds)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("537");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "McFlurry(McDonalds)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("362");
                    SaveDataInputToCSV.setAmount("50 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Medium fries":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("341");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Milkshake":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("450");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Pizza":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("266");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Quarter Pounder(McDonalds)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("527");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Steakhouse(Burger King)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("755");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Whopper(Burger King)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("613");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "X-Long Hot Chili Cheese(Burger King)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("579");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;
                case "Haribo candy":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("347");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Pingvin Blanding(Toms)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("370");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Familie Guf(Malaco)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("352");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Chocolate":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("549");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Chocolate bisquits":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("504");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Chips":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("531");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Coarse chips":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("497");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Gum with sugar":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("365");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Marcipan with chocolate":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("500");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Licorice":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("365");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Toffee":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("430");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Ice cream":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("198");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Vanilla cone":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("277");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Popsicle":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("89");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Floedeboller":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("430");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Nougat":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("550");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Nutella":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("215");
                    SaveDataInputToCSV.setAmount("50 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Hard candy":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("215");
                    SaveDataInputToCSV.setAmount("50 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;
                case "Potato":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("78");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Carrot":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("36");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();

                    break;

                case "Broccoli":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("39");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();

                    break;

                case "Rhubarb":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("26");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();

                    break;

                case "Iceberg(lettuce)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("15");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();

                    break;

                case "Spinach":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("25");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();

                    break;

                case "Green pepper":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("21");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();

                    break;

                case "Red pepper":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("31");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();

                    break;

                case "Tomato":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("20");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();

                    break;

                case "Cucumber":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("12");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();

                    break;
                case "Wholemeal Digestive":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("31");
                    SaveDataInputToCSV.setAmount("15 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Oatmeal":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("150");
                    SaveDataInputToCSV.setAmount("32 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Ryebread":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("224");
                    SaveDataInputToCSV.setAmount("50 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Coarse Grain Roll":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("233");
                    SaveDataInputToCSV.setAmount("80 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "White rolle":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("219");
                    SaveDataInputToCSV.setAmount("80 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Ryebread(Coarse grain/Dark)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("99");
                    SaveDataInputToCSV.setAmount("50 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Cake":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("430");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Crispedbread":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("80");
                    SaveDataInputToCSV.setAmount("23 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "White bread":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("55");
                    SaveDataInputToCSV.setAmount("20 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Wholemeal bread":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("49");
                    SaveDataInputToCSV.setAmount("20 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Biscuit":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("54");
                    SaveDataInputToCSV.setAmount("10 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Wheat bread(with sunflower seeds)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("135");
                    SaveDataInputToCSV.setAmount("50 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Cinnamon Roll":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("417");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;


                case "Sausage Roll":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("126");
                    SaveDataInputToCSV.setAmount("50 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Apple":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("52");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Apricot":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("45");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Apricot (dried)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("241");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Avocado":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("150");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Banana":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("89");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Blackberry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("45");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Blackcurrent":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("63");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Blueberry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("57");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Cantaloupe":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("34");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Carembola":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("31");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Cherimoya":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("75");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Cherry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("55");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Clementine":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("47");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Fig":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("75");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Fig(dried)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("249");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Cowberry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("44");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Cranberry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("46");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Redcurrant berry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("56");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Date(dried)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("227");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Durian":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("136");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Elderberry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("73");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Goji berry(dried)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("349");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Gooseberry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("44");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Grape":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("69");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;
                case "Grapefruit":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("42");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Ground cherry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("53");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Honeymelon":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("36");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Kaki":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("77");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Kiwi":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("61");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Kumquat":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("71");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Lemon":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("47");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Lime":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("30");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Mango":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("60");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Mango(dried)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("319");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Nectarine":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("44");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Olives(black)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("579");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Olives(green)":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("145");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Orange":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("47");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Papya":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("43");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Passion fruit":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("97");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Peaches":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("39");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Pear":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("57");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Pineapple":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("50");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Plums":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("46");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Pomegranate":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("83");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Prune":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("240");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Quince":
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("57");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Raisin":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("299");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Raspberry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("660");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Rose hip":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("79");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Sea buckthorn":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("85");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Strawberry":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("39");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Tangerine":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("53");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;

                case "Watermelon":
                    if(pref.contains(button_tag)){
                    }
                    else{
                        editor.putString(button_tag, "consists");
                        editor.apply();
                        SaveFavoriteToCSV.setButton_name(button_tag);
                        SaveFavoriteToCSV.writeExternalStorage();
                    }
                    SaveDataInputToCSV.setTypeOfSnack(button_tag);
                    SaveDataInputToCSV.setCalories("30");
                    SaveDataInputToCSV.setAmount("100 gr");
                    SaveDataInputToCSV.writeExternalStorage();
                    break;
            }





        SnackScreen.getInstance().finish();
        MainActivity.getInstance().finish();
        finish();
        Intent intent = new Intent(SnackSubCategory.this, MainActivity.class);
        startActivity(intent);
    }


    public static void setSnackScreenChosen(String snackScreenChosen) {
        SnackSubCategory.snackScreenChosen = snackScreenChosen;
    }
    public static String getSnackScreenChosen() {
        return snackScreenChosen;
    }

    public static String getButton_name() {
        return button_name;
    }

    public static void setButton_name(String button_name) {
        SnackSubCategory.button_name = button_name;
    }

}

