package com.example.app;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.*;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    //current page variables
    int focusedpage = 0;
    //hat
    int currentpageHats = 0;
    List<String> hatList = new ArrayList<>();
    File hatsfolder = new File("src\\main\\resources\\hat");
    File[] hatsCount = hatsfolder.listFiles();
    int hatsFileCount;
    {
        assert hatsCount != null;
        hatsFileCount = hatsCount.length - 1;
    }
    //uppertop
    int currentpageUT = 0;
    List<String> UTList = new ArrayList<>();
    File UTfolder = new File("src\\main\\resources\\uppertop");
    File[] UTCount = UTfolder.listFiles();
    int UTFileCount;
    {
        assert UTCount != null;
        UTFileCount = UTCount.length - 1;
    }
    //lowertop
    int currentpageLT = 0;
    List<String> LTList = new ArrayList<>();
    File LTfolder = new File("src\\main\\resources\\lowertop");
    File[] LTCount = LTfolder.listFiles();
    int LTFileCount;
    {
        assert LTCount != null;
        LTFileCount = LTCount.length - 1;
    }
    //upperbot
    int currentpageUB = 0;
    List<String> UBList = new ArrayList<>();
    File UBfolder = new File("src\\main\\resources\\upperbot");
    File[] UBCount = UBfolder.listFiles();
    int UBFileCount;
    {
        assert UBCount != null;
        UBFileCount = UBCount.length - 1;
    }
    //lowerbot
    int currentpageLB = 0;
    List<String> LBList = new ArrayList<>();
    File LBfolder = new File("src\\main\\resources\\lowerbot");
    File[] LBCount = LBfolder.listFiles();
    int LBFileCount;
    {
        assert LBCount != null;
        LBFileCount = LBCount.length - 1;
    }
    //accessories
    int currentpageAccessories = 0;
    List<String> AccessoriesList = new ArrayList<>();
    File accessoriesfolder = new File("src\\main\\resources\\accessory");
    File[] accessoriesCount = accessoriesfolder.listFiles();
    int accessoriesFileCount;
    {
        assert accessoriesCount != null;
        accessoriesFileCount = accessoriesCount.length - 1;
    }
    //backgrounds
    int currentpageBackgrounds = 0;
    List<String> BGList = new ArrayList<>();
    File BGfolder = new File("src\\main\\resources\\backgrounds");
    File[] BGCount = BGfolder.listFiles();
    int BGFileCount;
    {
        assert BGCount != null;
        BGFileCount = BGCount.length - 1;
    }
    //subjects
    int currentpageSubjects = 0;
    List<String> SubList = new ArrayList<>();
    File subfolder = new File("src\\main\\resources\\subjects");
    File[] subCount = subfolder.listFiles();
    int subFileCount;
    {
        assert subCount != null;
        subFileCount = subCount.length - 1;
    }
    //
    Pane characterPane = new Pane();
    Pane backgroundPane = new Pane();
    //creating subjects
    InputStream subjectInput = MyApplication.class.getResourceAsStream("/subjects/1.png");
    Image subjectImage;
    {
        assert subjectInput != null;
        subjectImage = new Image(subjectInput);
    }
    ImageView subject = new ImageView(subjectImage);
    //hats
    InputStream hatInput = MyApplication.class.getResourceAsStream("/hat/1.png");
    Image hatImage;
    {
        assert hatInput != null;
        hatImage = new Image(hatInput);
    }
    ImageView hat = new ImageView(hatImage);
    //uppertop
    InputStream uppertopInput = MyApplication.class.getResourceAsStream("/uppertop/1.png");
    Image uppertopImage;
    {
        assert uppertopInput != null;
        uppertopImage = new Image(uppertopInput);
    }
    ImageView uppertop = new ImageView(uppertopImage);
    //lowertop
    InputStream lowertopInput = MyApplication.class.getResourceAsStream("/lowertop/1.png");
    Image lowertopImage;
    {
        assert lowertopInput != null;
        lowertopImage = new Image(lowertopInput);
    }
    ImageView lowertop = new ImageView(lowertopImage);
    //upperbot
    InputStream upperbotInput = MyApplication.class.getResourceAsStream("/upperbot/1.png");
    Image upperbotImage;
    {
        assert upperbotInput != null;
        upperbotImage = new Image(upperbotInput);
    }
    ImageView upperbot = new ImageView(upperbotImage);
    //lowerbot
    InputStream lowerbotInput = MyApplication.class.getResourceAsStream("/lowerbot/1.png");
    Image lowerbotImage;
    {
        assert lowerbotInput != null;
        lowerbotImage = new Image(lowerbotInput);
    }
    ImageView lowerbot = new ImageView(lowerbotImage);
    //accessories
    InputStream accessoriesInput = MyApplication.class.getResourceAsStream("/accessory/1.png");
    Image accessoriesImage;
    {
        assert accessoriesInput != null;
        accessoriesImage = new Image(accessoriesInput);
    }
    ImageView accessories = new ImageView(accessoriesImage);
    //backgrounds
    InputStream BGInput = MyApplication.class.getResourceAsStream("/backgrounds/1.png");
    Image BGImage;
    {
        assert BGInput != null;
        BGImage = new Image(BGInput);
    }
    int increment = 5;
    int hatLayerX, hatLayerY, uppertopX, uppertopY, lowertopX, lowertopY, upperbotX, upperbotY, lowerbotX, lowerbotY, accessoriesX, accessoriesY, subjectX, subjectY = 0;
    ImageView background = new ImageView(BGImage);
    @Override
    public void start(Stage primaryStage) {
        for (int i = 0; i < hatsCount.length; i++){
            if (hatsCount[i].isFile()){
                hatList.add(hatsCount[i].getName());
            }
        }
        for (int a = 0; a < UTCount.length; a++){
            if (UTCount[a].isFile()){
                UTList.add(UTCount[a].getName());
            }
        }
        for (int b = 0; b < LTCount.length; b++){
            if (LTCount[b].isFile()){
                LTList.add(LTCount[b].getName());
            }
        }
        for (int c = 0; c < UBCount.length; c++){
            if (UBCount[c].isFile()){
                UBList.add(UBCount[c].getName());
            }
        }
        for (int d = 0; d < LBCount.length; d++){
            if (LBCount[d].isFile()){
                LBList.add(LBCount[d].getName());
            }
        }
        for (int e = 0; e < accessoriesCount.length; e++){
            if (accessoriesCount[e].isFile()){
                AccessoriesList.add(accessoriesCount[e].getName());
            }
        }
        for (int f = 0; f < BGCount.length; f++){
            if (BGCount[f].isFile()){
                BGList.add(BGCount[f].getName());
            }
        }
        for (int g = 0; g < subCount.length; g++){
            if (subCount[g].isFile()){
                SubList.add(subCount[g].getName());
            }
        }
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(createBGBox());
        borderPane.setBottom(createButtonBox());
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
    public Node createButtonBox() {
        VBox buttonContainer = new VBox();
        HBox[] buttonRows = new HBox[]{
            new HBox(),
            new HBox(),
            new HBox(),
        };
        Button uButton = new Button("Move Upwards");
        Button dButton = new Button("Move Downwards");
        Button rButton = new Button("Move Right");
        Button lButton = new Button("Move Left");
        buttonRows[2].getChildren().addAll(uButton, dButton, lButton, rButton);
        Button[] levelButton = new Button[]{
            new Button("Hats #1"),
            new Button("Upper Top #1"),
            new Button("Lower Top #1"),
            new Button("Upper Bot #1"),
            new Button("Lower Bot #1"),
            new Button("Accessories #1"),
            new Button("Characters #1"),
            new Button("Background #1"),
        };
        Button[] rightButton = new Button[]{
            new Button("->"),
            new Button("->"),
            new Button("->"),
            new Button("->"),
            new Button("->"),
            new Button("->"),
            new Button("->"),
            new Button("->"),
            new Button("->"),
        };
        Button[] leftButton = new Button[]{
            new Button("<-"),
            new Button("<-"),
            new Button("<-"),
            new Button("<-"),
            new Button("<-"),
            new Button("<-"),
            new Button("<-"),
            new Button("<-"),
            new Button("<-"),
        };
        for (int i = 0; i < levelButton.length; i++){
            levelButton[i].setPrefSize(124,20);
            leftButton[i].setPrefSize(63,20);
            rightButton[i].setPrefSize(63,20);
            //hats
            if (i == 0) {
                levelButton[i].setOnAction((ActionEvent) -> focusedpage = 1);
                leftButton[i].setOnAction((ActionEvent) -> {
                    focusedpage = 1;
                    if (currentpageHats != 0) {
                        currentpageHats--;
                        updateScene();
                    } else {
                        currentpageHats = hatsFileCount;
                        updateScene();
                    }
                    levelButton[0].setText("Hats #" + (currentpageHats + 1));
                });
                rightButton[i].setOnAction((ActionEvent) -> {
                    focusedpage = 1;
                    if (currentpageHats < hatsFileCount) {
                        currentpageHats++;
                        updateScene();
                    } else {
                        currentpageHats = 0;
                        updateScene();
                    }
                    levelButton[0].setText("Hats #" + (currentpageHats + 1));
                });
                buttonRows[0].getChildren().addAll(leftButton[i], levelButton[i], rightButton[i]);
            }
            //Upper top
            if (i == 1){
                levelButton[i].setOnAction((ActionEvent)-> focusedpage = 2);
                leftButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 2;
                    if (currentpageUT != 0){
                        currentpageUT--;
                        updateScene();
                    }
                    else{
                        currentpageUT = UTFileCount;
                        updateScene();
                    }
                    levelButton[1].setText("Upper Top #" + (currentpageUT + 1));
                });
                rightButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 2;
                    if (currentpageUT < UTFileCount){
                        currentpageUT++;
                        updateScene();
                    }
                    else{
                        currentpageUT = 0;
                        updateScene();
                    }
                    levelButton[1].setText("Upper Top #" + (currentpageUT + 1));
                });
                buttonRows[0].getChildren().addAll(leftButton[i], levelButton[i], rightButton[i]);
            }
            //lower top
            if (i == 2){
                levelButton[i].setOnAction((ActionEvent)-> focusedpage = 3);
                leftButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 3;
                    if (currentpageLT != 0){
                        currentpageLT--;
                        updateScene();
                    }
                    else{
                        currentpageLT = LTFileCount;
                        updateScene();
                    }
                    levelButton[2].setText("Lower Top #" + (currentpageLT + 1));
                });
                rightButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 3;
                    if (currentpageLT < LTFileCount){
                        currentpageLT++;
                        updateScene();
                    }
                    else{
                        currentpageLT = 0;
                        updateScene();
                    }
                    levelButton[2].setText("Lower Top #" + (currentpageLT + 1));
                });
                buttonRows[0].getChildren().addAll(leftButton[i], levelButton[i], rightButton[i]);
            }
            //upperbot
            if (i == 3){
                levelButton[i].setOnAction((ActionEvent)-> focusedpage = 4);
                leftButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 4;
                    if (currentpageUB != 0){
                        currentpageUB--;
                        updateScene();
                    }
                    else{
                        currentpageUB = UBFileCount;
                        updateScene();
                    }
                    levelButton[3].setText("Upper Bottom #" + (currentpageUB + 1));
                });
                rightButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 4;
                    if (currentpageUB < UBFileCount){
                        currentpageUB++;
                        updateScene();
                    }
                    else{
                        currentpageUB = 0;
                        updateScene();
                    }
                    levelButton[3].setText("Upper Bottom #" + (currentpageUB + 1));
                });
                buttonRows[0].getChildren().addAll(leftButton[i], levelButton[i], rightButton[i]);
            }
            //lowerbot
            if (i == 4){
                levelButton[i].setOnAction((ActionEvent)-> focusedpage = 5);
                leftButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 5;
                    if (currentpageLB != 0){
                        currentpageLB--;
                        updateScene();
                    }
                    else{
                        currentpageLB = LBFileCount;
                        updateScene();
                    }
                    levelButton[4].setText("Lower Bottom #" + (currentpageUB + 1));
                });
                rightButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 5;
                    if (currentpageLB < LBFileCount){
                        currentpageLB++;
                        updateScene();
                    }
                    else{
                        currentpageLB = 0;
                        updateScene();
                    }
                    levelButton[4].setText("Lower Bottom #" + (currentpageUB + 1));
                });
                buttonRows[1].getChildren().addAll(leftButton[i], levelButton[i], rightButton[i]);
            }
            //accessories
            if (i == 5){
                levelButton[i].setOnAction((ActionEvent)-> focusedpage = 6);
                leftButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 6;
                    if (currentpageAccessories != 0){
                        currentpageAccessories--;
                        updateScene();
                    }
                    else{
                        currentpageAccessories = accessoriesFileCount;
                        updateScene();
                    }
                    levelButton[5].setText("Accessories #" + (currentpageAccessories + 1));
                });
                rightButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 6;
                    if (currentpageAccessories < accessoriesFileCount){
                        currentpageAccessories++;
                        updateScene();
                    }
                    else{
                        currentpageAccessories = 0;
                        updateScene();
                    }
                    levelButton[5].setText("Accessories #" + (currentpageAccessories + 1));
                });
                buttonRows[1].getChildren().addAll(leftButton[i], levelButton[i], rightButton[i]);
            }
            //subjects
            if (i == 6){
                levelButton[i].setOnAction((ActionEvent)-> focusedpage = 7);
                leftButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 7;
                    if (currentpageSubjects != 0){
                        currentpageSubjects--;
                        updateScene();
                    }
                    else{
                        currentpageSubjects = subFileCount;
                        updateScene();
                    }
                    levelButton[6].setText("Character #" + (currentpageSubjects + 1));
                });
                rightButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 7;
                    if (currentpageSubjects < subFileCount){
                        currentpageSubjects++;
                        updateScene();
                    }
                    else{
                        currentpageSubjects = 0;
                        updateScene();
                    }
                    levelButton[6].setText("Character #" + (currentpageSubjects + 1));
                });
                buttonRows[1].getChildren().addAll(leftButton[i], levelButton[i], rightButton[i]);
            }
            //
            if (i == 7){
                levelButton[i].setOnAction((ActionEvent)-> focusedpage = 8);
                leftButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 8;
                    if (currentpageBackgrounds != 0){
                        currentpageBackgrounds--;
                        updateScene();
                    }
                    else{
                        currentpageBackgrounds = BGFileCount;
                        updateScene();
                    }
                    levelButton[7].setText("Background #" + (currentpageBackgrounds + 1));
                });
                rightButton[i].setOnAction((ActionEvent)->{
                    focusedpage = 8;
                    if (currentpageBackgrounds < BGFileCount){
                        currentpageBackgrounds++;
                        updateScene();
                    }
                    else{
                        currentpageBackgrounds = 0;
                        updateScene();
                    }
                    levelButton[7].setText("Background #" + (currentpageBackgrounds + 1));
                });
                buttonRows[1].getChildren().addAll(leftButton[i], levelButton[i], rightButton[i]);
            }
        }
        buttonContainer.getChildren().addAll(buttonRows);

        uButton.setOnAction((ActionEvent) ->{
            if (focusedpage == 1){
                hatLayerY = hatLayerY - increment;
                hat.setLayoutY(hatLayerY);
            }
            if (focusedpage == 2){
                uppertopY = uppertopY - increment;
                uppertop.setLayoutY(uppertopY);
            }
            if (focusedpage == 3){
                lowertopY = lowertopY - increment;
                lowertop.setLayoutY(lowertopY);
            }
            if (focusedpage == 4){
                upperbotY = upperbotY - increment;
                upperbot.setLayoutY(upperbotY);
            }
            if (focusedpage == 5){
                lowerbotY = lowerbotY - increment;
                lowerbot.setLayoutY(lowerbotY);
            }
            if (focusedpage == 6){
                accessoriesY = accessoriesY - increment;
                accessories.setLayoutY(accessoriesY);
            }
            if (focusedpage == 7){
                subjectY = subjectY - increment;
                subject.setLayoutY(subjectY);
            }
        });
        dButton.setOnAction((ActionEvent) ->{
            if (focusedpage == 1){
                hatLayerY = hatLayerY + increment;
                hat.setLayoutY(hatLayerY);
            }
            if (focusedpage == 2){
                uppertopY = uppertopY + increment;
                uppertop.setLayoutY(uppertopY);
            }
            if (focusedpage == 3){
                lowertopY = lowertopY + increment;
                lowertop.setLayoutY(lowertopY);
            }
            if (focusedpage == 4){
                upperbotY = upperbotY + increment;
                upperbot.setLayoutY(upperbotY);
            }
            if (focusedpage == 5){
                lowerbotY = lowerbotY + increment;
                lowerbot.setLayoutY(lowerbotY);
            }
            if (focusedpage == 6){
                accessoriesY = accessoriesY + increment;
                accessories.setLayoutY(accessoriesY);
            }
            if (focusedpage == 7){
                subjectY = subjectY + increment;
                subject.setLayoutY(subjectY);
            }
        });
        rButton.setOnAction((ActionEvent) ->{
            if (focusedpage == 1){
                hatLayerX = hatLayerX + increment;
                hat.setLayoutX(hatLayerX);
            }
            if (focusedpage == 2){
                uppertopX = uppertopX + increment;
                uppertop.setLayoutX(uppertopX);
            }
            if (focusedpage == 3){
                lowertopX = lowertopX + increment;
                lowertop.setLayoutX(lowertopX);
            }
            if (focusedpage == 4){
                upperbotX = upperbotX + increment;
                upperbot.setLayoutX(upperbotX);
            }
            if (focusedpage == 5){
                lowerbotX = lowerbotX + increment;
                lowerbot.setLayoutX(lowerbotX);
            }
            if (focusedpage == 6){
                accessoriesX = accessoriesX + increment;
                accessories.setLayoutX(accessoriesX);
            }
            if (focusedpage == 7){
                subjectX = subjectX + increment;
                subject.setLayoutY(subjectX);
            }
        });
        lButton.setOnAction((ActionEvent) ->{
            if (focusedpage == 1){
                hatLayerX = hatLayerX - increment;
                hat.setLayoutX(hatLayerX);
            }
            if (focusedpage == 2){
                uppertopX = uppertopX - increment;
                uppertop.setLayoutX(uppertopX);
            }
            if (focusedpage == 3){
                lowertopX = lowertopX - increment;
                lowertop.setLayoutX(lowertopX);
            }
            if (focusedpage == 4){
                upperbotX = upperbotX - increment;
                upperbot.setLayoutX(upperbotX);
            }
            if (focusedpage == 5){
                lowerbotX = lowerbotX - increment;
                lowerbot.setLayoutX(lowerbotX);
            }
            if (focusedpage == 6){
                accessoriesX = accessoriesX - increment;
                accessories.setLayoutX(accessoriesX);
            }
            if (focusedpage == 7){
                subjectX = subjectX - increment;
                subject.setLayoutY(subjectX);
            }
        });
        return buttonContainer;
    }
    public void updateScene(){
        //hats
        InputStream hatInput =  MyApplication.class.getResourceAsStream("/hat/" + hatList.get(currentpageHats));
        assert hatInput != null;
        hat.setImage(new Image(hatInput));
        //uppertop
        InputStream UTInput =  MyApplication.class.getResourceAsStream("/uppertop/" + UTList.get(currentpageUT));
        assert UTInput != null;
        uppertop.setImage(new Image(UTInput));
        //lowertop
        InputStream LTInput =  MyApplication.class.getResourceAsStream("/lowertop/" + LTList.get(currentpageLT));
        assert LTInput != null;
        lowertop.setImage(new Image(LTInput));
        //upperbot
        InputStream UBInput =  MyApplication.class.getResourceAsStream("/upperbot/" + UBList.get(currentpageUB));
        assert UBInput != null;
        upperbot.setImage(new Image(UBInput));
        //lowerbot
        InputStream LBInput =  MyApplication.class.getResourceAsStream("/lowerbot/" + LBList.get(currentpageLB));
        assert LBInput != null;
        lowerbot.setImage(new Image(LBInput));
        //accessories
        InputStream accessoriesInput =  MyApplication.class.getResourceAsStream("/accessory/" + AccessoriesList.get(currentpageAccessories));
        assert accessoriesInput != null;
        accessories.setImage(new Image(accessoriesInput));
        //backgrounds
        InputStream BGInput =  MyApplication.class.getResourceAsStream("/backgrounds/" + BGList.get(currentpageBackgrounds));
        assert BGInput != null;
        background.setImage(new Image(BGInput));
        //subjects
        InputStream subjectInput =  MyApplication.class.getResourceAsStream("/subjects/" + SubList.get(currentpageSubjects));
        assert subjectInput != null;
        subject.setImage(new Image(subjectInput));
    }
    public void createScene(){
        characterPane.getChildren().addAll(subject, lowerbot, lowertop, upperbot, uppertop, accessories, hat);
        backgroundPane.getChildren().add(characterPane);
    }
    public Node createBGBox() {
        InputStream BGInput =  MyApplication.class.getResourceAsStream("/backgrounds/" + BGList.get(currentpageBackgrounds));
        assert BGInput != null;
        background.setImage(new Image(BGInput));
        backgroundPane.getChildren().add(background);
        createScene();
        return backgroundPane;
    }
    public static void main(String[] args) {
        launch(args);
    }
}