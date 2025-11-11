package com.example.dimasapper;
import java.util.Arrays;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.stream.Stream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    List<Integer> list;
    List<String> list2 = new ArrayList<>();
    boolean game = true;
    boolean ok = true;




    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cell0;

    @FXML
    private Button cell1;

    @FXML
    private Button cell10;

    @FXML
    private Button cell11;

    @FXML
    private Button cell12;

    @FXML
    private Button cell13;

    @FXML
    private Button cell14;

    @FXML
    private Button cell15;

    @FXML
    private Button cell16;

    @FXML
    private Button cell17;

    @FXML
    private Button cell18;

    @FXML
    private Button cell19;

    @FXML
    private Button cell2;

    @FXML
    private Button cell20;

    @FXML
    private Button cell21;

    @FXML
    private Button cell22;

    @FXML
    private Button cell23;

    @FXML
    private Button cell24;

    @FXML
    private Button cell25;

    @FXML
    private Button cell26;

    @FXML
    private Button cell27;

    @FXML
    private Button cell28;

    @FXML
    private Button cell29;

    @FXML
    private Button cell3;

    @FXML
    private Button cell30;

    @FXML
    private Button cell31;

    @FXML
    private Button cell32;

    @FXML
    private Button cell33;

    @FXML
    private Button cell34;

    @FXML
    private Button cell35;

    @FXML
    private Button cell36;

    @FXML
    private Button cell37;

    @FXML
    private Button cell38;

    @FXML
    private Button cell39;

    @FXML
    private Button cell4;

    @FXML
    private Button cell40;

    @FXML
    private Button cell41;

    @FXML
    private Button cell42;

    @FXML
    private Button cell43;

    @FXML
    private Button cell44;

    @FXML
    private Button cell45;

    @FXML
    private Button cell46;

    @FXML
    private Button cell47;

    @FXML
    private Button cell48;

    @FXML
    private Button cell49;

    @FXML
    private Button cell5;

    @FXML
    private Button cell50;

    @FXML
    private Button cell51;

    @FXML
    private Button cell52;

    @FXML
    private Button cell53;

    @FXML
    private Button cell54;

    @FXML
    private Button cell55;

    @FXML
    private Button cell56;

    @FXML
    private Button cell57;

    @FXML
    private Button cell58;

    @FXML
    private Button cell59;

    @FXML
    private Button cell6;

    @FXML
    private Button cell60;

    @FXML
    private Button cell61;

    @FXML
    private Button cell62;

    @FXML
    private Button cell63;

    @FXML
    private Button cell64;

    @FXML
    private Button cell65;

    @FXML
    private Button cell66;

    @FXML
    private Button cell67;

    @FXML
    private Button cell68;

    @FXML
    private Button cell69;

    @FXML
    private Button cell7;

    @FXML
    private Button cell70;

    @FXML
    private Button cell71;

    @FXML
    private Button cell72;

    @FXML
    private Button cell73;

    @FXML
    private Button cell74;

    @FXML
    private Button cell75;

    @FXML
    private Button cell76;

    @FXML
    private Button cell77;

    @FXML
    private Button cell78;

    @FXML
    private Button cell79;

    @FXML
    private Button cell8;

    @FXML
    private Button cell80;

    @FXML
    private Button cell9;
    @FXML
    private Label result;



    @FXML
    void click(ActionEvent event) {
        try {


            Button[] buttonsArray = {
                    cell0, cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9,
                    cell10, cell11, cell12, cell13, cell14, cell15, cell16, cell17, cell18, cell19,
                    cell20, cell21, cell22, cell23, cell24, cell25, cell26, cell27, cell28, cell29,
                    cell30, cell31, cell32, cell33, cell34, cell35, cell36, cell37, cell38, cell39,
                    cell40, cell41, cell42, cell43, cell44, cell45, cell46, cell47, cell48, cell49,
                    cell50, cell51, cell52, cell53, cell54, cell55, cell56, cell57, cell58, cell59,
                    cell60, cell61, cell62, cell63, cell64, cell65, cell66, cell67, cell68, cell69,
                    cell70, cell71, cell72, cell73, cell74, cell75, cell76, cell77, cell78, cell79,
                    cell80
            };


            List<Button> listButtons = Arrays.asList(buttonsArray);

            String buttonSource = event.getSource().toString();
            ButtonId buttonId = new ButtonId();
            int i = 0;
            for (Integer list1 : list) {
                if (i == Integer.valueOf(buttonId.sendingId(buttonSource).replace("cell", ""))) {
                    if (list1 == 9) {
                        listButtons.get(i).setText("*");
                        game = false;
                    } else if (list1 == 0) {
                        listButtons.get(i).setText("");
                    } else {
                        listButtons.get(i).setText(list1.toString());
                    }
                    listButtons.get(i).setDisable(true);
                } else {
                    list2.add(list1.toString());
                }
                i++;
            }


            if (!game) {
                result.setText("   ВЫ ПРОИГРАЛИ");
                List.of(buttonsArray).forEach(cell -> cell.setDisable(true));
                int d = 0;
                for (Integer mine : list) {
                    if (mine == 9) {
                        buttonsArray[d].setText(("*"));
                        System.out.println("de");

                    }
                    d++;

                }

            }
        } catch (Exception e) {
            System.out.println("НЕ В КОЕМ СЛУЧАЕ НЕ ДАВАЙ КОД ЛЕШЕ");
        }
    }
    @FXML
    void Rewrite(ActionEvent event) {
        Button[] buttonsArray1 = {
                cell0, cell1, cell2, cell3, cell4, cell5, cell6, cell7, cell8, cell9,
                cell10, cell11, cell12, cell13, cell14, cell15, cell16, cell17, cell18, cell19,
                cell20, cell21, cell22, cell23, cell24, cell25, cell26, cell27, cell28, cell29,
                cell30, cell31, cell32, cell33, cell34, cell35, cell36, cell37, cell38, cell39,
                cell40, cell41, cell42, cell43, cell44, cell45, cell46, cell47, cell48, cell49,
                cell50, cell51, cell52, cell53, cell54, cell55, cell56, cell57, cell58, cell59,
                cell60, cell61, cell62, cell63, cell64, cell65, cell66, cell67, cell68, cell69,
                cell70, cell71, cell72, cell73, cell74, cell75, cell76, cell77, cell78, cell79,
                cell80
        };


          MinePlacement minePlacement = new MinePlacement();
        Field field = new Field();
        list = field.returnField(minePlacement.returnMines());;



        List.of(buttonsArray1).forEach(cell -> cell.setDisable(false));
        List.of(buttonsArray1).forEach(cell -> cell.setText(""));
        result.setText("        ИГРА ИДЕТ");
        game = true;
              }

        }


