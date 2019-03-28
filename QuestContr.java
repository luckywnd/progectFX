package quest;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class QuestContr {
	boolean answer;
	int counWin;
	int counLoose;
	int counChoise = 0;
	Image image;
	ImageView view;
	String message;
	Set<String> set;
	int index = 0;
	int count = 0;
	String name;
	List<String> list1 = new ArrayList<String>();
	int random = (int) (Math.random() * list1.size());

	@FXML
	private ResourceBundle resources;

	@FXML
	private Label lblCompleteText;

	@FXML
	private Label lblCountComplete;

	@FXML
	private Label lblComplete;

	@FXML
	private URL location;

	@FXML
	private ListView<String> createList;

	@FXML
	private Label lblName;

	@FXML
	private Label lblQuest;

	@FXML
	private ListView<String> resList;

	@FXML
	private Button btnNext;

	@FXML
	private Label lblRes;

	@FXML
	private Button btnCreate;

	@FXML
	private Button btnClear;

	@FXML
	private Label lblDec;

	@FXML
	private ListView<String> decList;

	@FXML
	private Button btnAddRes;

	@FXML
	private Button btnAddDec;

	@FXML
	private Label lblRandomName;

	@FXML
	private Label lblCountWin;

	@FXML
	private Label lblCountLoose;

	@FXML
	private Label lblCountChoise;

	@FXML
	private Label lblChoise;

	@FXML
	private Label lblLoose;

	@FXML
	private Label lblWin;

	ObservableList<String> resName = FXCollections.observableArrayList("паста", "моцарела", "тёртая ветчина",
			"ломтики ветчины", "ломтики бекона", "тёртый бекон", "лук обычный", "лук порей", "шампиньоны",
			"маринованные опята", "боровики", "салями", "копчённые колбаски", "сосиски", "колбаски пеперони",
			"свинина отварная", "жаренная курица", "отбитая курица", "отбитая свинина", "отбитая говядина",
			"копчёная говядина", "консервированный перец", "шпинат", "сыр фета", "сыр чеддер", "сыр джугас",
			"сыр дорблю", "креветки", "мидии", "лосось", "взбитое яйцо", "начинка из говядины(говяжий фарш)",
			"соус охотничий", "соус ранч", "соус барбекю", "соус сметанный с чесноком", "хреновый соус",
			"приправа тако", "приправа кайенский перец", "кусочки ананаса", "соус сырный", "соус майонез с зеленью",
			"соус цезарь");

	ObservableList<String> decName = FXCollections.observableArrayList("ломтики помидор", "маслины", "лимон",
			"помидоры черри", "перец свежий", "перец чили", "красный лук", "перец халапенью", "перец пеперони",
			"маринованные огурцы", "кукуруза", "консервированный лук", "каперсы", "картофель фри", "свежий огурец",
			"отварное яйцо", "рукола", "листы салата", "жаренное куриное филе(холодный цех)");

	ObservableList<String> choiseList = FXCollections.observableArrayList();

	@FXML
	void initialize() {
		createList();
		AddButtons();

	}

	public void createList() {
		resList.setItems(resName);
		resList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		resList.setMaxSize(200, 177);
		resList.setStyle("-fx-font: bold italic 10pt Georgia;");
		decList.setItems(decName);
		decList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		decList.setMaxSize(200, 124);
		decList.setStyle("-fx-font: bold italic 10pt Georgia;");

		list1.add("4 сезона");
		list1.add("Аппетитная");
		list1.add("Везувий");
		list1.add("Гавайская");
		list1.add("Греческая");
		list1.add("Грибная");
		list1.add("Деревенская");
		list1.add("Маргарита");
		list1.add("Маринара");
		list1.add("Огненная");
		list1.add("Особенная");
		list1.add("Охотничья");
		list1.add("Палитра сыров");
		list1.add("Пеперони");
		list1.add("Пикантная");
		list1.add("Повседневная");
		list1.add("Римская");
		list1.add("Ромео");
		list1.add("Сицилийская");
		list1.add("Соренто");
		list1.add("Толстушка с ветчиной");
		list1.add("Толстушка с курицей");
		list1.add("Толстушка со свининой");
		list1.add("ТутБай");
		list1.add("Флорентийская");
		list1.add("Студенчиская");
		list1.add("Барбекю");
		list1.add("Боровик");
		list1.add("Мясная");
		list1.add("Техас");
		list1.add("Кораблик");
		list1.add("Каруселька");
		list1.add("ЭнгриБёрдс");
		list1.add("Пигата с ветчиной");
		list1.add("Пигата с курицей");
		list1.add("Пигата с говядиной");
		list1.add("Народная");
		list1.add("Курица с пеперони");
	}

	public void AddButtons() {
		btnAddRes.setOnAction(event -> {
			choiseList.addAll(resList.getSelectionModel().getSelectedItems());
			createList.setItems(choiseList);
			createList.setMaxSize(242, 213);
			createList.setStyle("-fx-font: bold italic 10pt Georgia;");
			resList.getSelectionModel().clearSelection();
		});

		btnAddDec.setOnAction(event -> {
			choiseList.addAll(decList.getSelectionModel().getSelectedItems());
			createList.setItems(choiseList);
			createList.setMaxSize(242, 213);
			decList.getSelectionModel().clearSelection();
		});

		btnNext.setOnAction(event -> {
			choiseList.removeAll(choiseList);
			likeRandom();
			image = new Image("/img/FullWin.jpg");
			view = new ImageView(image);
			lblRandomName.setText(name);
			count++;
			if (count > 1) {
				
				counChoise++;
				lblCountChoise.setText("" + counChoise);
				if (index >= 37) {
					display2(view);
					counWin = 0;
					counLoose = 0;
					counChoise = 0;
					lblCountWin.setText("" + counWin);
					lblCountChoise.setText("" + counChoise);
					lblCountLoose.setText("" + counLoose);
					end();
				}
			}

		});

		btnClear.setOnAction(event -> {
			ObservableList<String> temp = FXCollections
					.observableArrayList(createList.getSelectionModel().getSelectedItems());
			choiseList.removeAll(temp);
			createList.getSelectionModel().clearSelection();
		});

		btnCreate.setOnAction(event -> {
			if (counLoose > 3) {
				choiseList.removeAll(choiseList);
				name = "" + list1.get(random);
				counChoise++;
				lblCountChoise.setText("" + counChoise);
				image = new Image("/img/end.jpg");
				view = new ImageView(image);
				display2(view);
				counWin = 0;
				counLoose = 0;
				counChoise = 0;
				lblCountWin.setText("" + counWin);
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				testRemove(lblRandomName.getText());

			} else {
				Test();
				
				
			}

		});
	}

	public void likeRandom() {
		if (list1.size() > 0) {
			random = (int) (Math.random() * list1.size());
			name = "" + list1.get(random);

		} else {
			name = "You win";
		}

	}

	public void testRemove(String rem) {
		Iterator<String> iter = list1.iterator();
		if (list1.size() > 0) {
			while (iter.hasNext()) {

				if (rem.contains(iter.next())) {

					iter.remove();
					System.out.println(list1.size());
					System.out.println(rem + " -----> remove");
				}
			}
		} else {

		}

	}

	public boolean Test() {
		switch (lblRandomName.getText()) {
		case "Везувий":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("ломтики ветчины")
					& choiseList.size() == 3) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/Везувий.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;

			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}

		case "Аппетитная":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртый бекон")
					& choiseList.contains("жаренная курица") & choiseList.contains("соус барбекю")
					& choiseList.contains("помидоры черри") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/аппетитная.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}

		case "4 сезона":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("шампиньоны")
					& choiseList.contains("тёртая ветчина") & choiseList.contains("креветки")
					& choiseList.contains("мидии") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/4 сезона.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}

		case "Венецианская":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртая ветчина")
					& choiseList.contains("креветки") & choiseList.contains("лимон") & choiseList.size() == 5) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/венецианская.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Гавайская":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртая ветчина")
					& choiseList.contains("кусочки ананаса") & choiseList.size() == 4) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/гавайская.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Греческая":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("сыр фета")
					& choiseList.contains("шпинат") & choiseList.contains("соус сметанный с чесноком")
					& choiseList.contains("помидоры черри") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/греческая.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Грибная":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("шампиньоны")
					& choiseList.size() == 3) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/грибная.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Деревенская":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("ломтики бекона")
					& choiseList.contains("лук обычный") & choiseList.contains("маринованные огурцы")
					& choiseList.contains("взбитое яйцо") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/деревенская.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Маргарита":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.size() == 2) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/маргарита.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Маринара":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("лосось")
					& choiseList.contains("креветки") & choiseList.contains("лимон") & choiseList.contains("каперсы")
					& choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/маринара.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Народная":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртая ветчина")
					& choiseList.contains("шампиньоны") & choiseList.contains("маринованные огурцы")
					& choiseList.size() == 5) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/народная.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Огненная":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртый бекон")
					& choiseList.contains("свинина отварная") & choiseList.contains("соус охотничий")
					& choiseList.contains("хреновый соус") & choiseList.contains("приправа кайенский перец")
					& choiseList.contains("перец чили") & choiseList.contains("перец халапенью")
					& choiseList.contains("консервированный лук") & choiseList.size() == 10) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/огненая.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Особенная":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртая ветчина")
					& choiseList.contains("шампиньоны") & choiseList.contains("салями") & choiseList.contains("маслины")
					& choiseList.contains("перец халапенью") & choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/особенная.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Охотничья":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("ломтики бекона")
					& choiseList.contains("лук обычный") & choiseList.contains("соус охотничий")
					& choiseList.contains("приправа тако") & choiseList.contains("отбитая говядина")
					& choiseList.contains("шампиньоны") & choiseList.contains("перец чили") & choiseList.size() == 9) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/охотничья.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Палитра сыров":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("сыр джугас")
					& choiseList.contains("сыр дорблю") & choiseList.contains("сыр фета")
					& choiseList.contains("помидоры черри") & choiseList.contains("маслины") & choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/палитра сыров.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Пеперони":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртая ветчина")
					& choiseList.contains("лук обычный") & choiseList.contains("салями")
					& choiseList.contains("консервированный перец") & choiseList.contains("перец чили")
					& choiseList.contains("перец пеперони") & choiseList.size() == 8) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/пеперони.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Пикантная":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("отбитая курица")
					& choiseList.contains("кусочки ананаса") & choiseList.size() == 4) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/пикантная.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Повседневная":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("салями")
					& choiseList.contains("ломтики помидор") & choiseList.size() == 4) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/повседневная.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Римская":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртый бекон")
					& choiseList.contains("жаренная курица") & choiseList.contains("соус сырный")
					& choiseList.contains("маринованные огурцы") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/римская.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Ромео":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртая ветчина")
					& choiseList.contains("отбитая свинина") & choiseList.contains("соус ранч")
					& choiseList.size() == 5) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/ромео.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Сицилийская":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("отбитая курица")
					& choiseList.contains("шампиньоны") & choiseList.contains("перец чили")
					& choiseList.contains("перец пеперони") & choiseList.size() == 6) {

				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/сицилийская.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Соренто":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("ломтики бекона")
					& choiseList.contains("копчёная говядина") & choiseList.contains("соус барбекю")
					& choiseList.contains("консервированный перец") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/соренто.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Толстушка с ветчиной":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("ломтики ветчины")
					& choiseList.contains("шампиньоны") & choiseList.contains("маслины") & choiseList.size() == 5) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/толстушка с вет.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Толстушка с курицей":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("жаренная курица")
					& choiseList.contains("шампиньоны") & choiseList.contains("ломтики помидор")
					& choiseList.contains("лук порей") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/толстушка с курицей.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Толстушка со свининой":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("ломтики бекона")
					& choiseList.contains("свинина отварная") & choiseList.contains("ломтики помидор")
					& choiseList.contains("перец халапенью") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/толстушка со свининой.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "ТутБай":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртый бекон")
					& choiseList.contains("салями") & choiseList.contains("соус сметанный с чесноком")
					& choiseList.contains("ломтики помидор") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/тут бай.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Флорентийская":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртая ветчина")
					& choiseList.contains("отбитая свинина") & choiseList.contains("лук порей")
					& choiseList.contains("соус ранч") & choiseList.contains("маринованные опята")
					& choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/флорентийская.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Студенчиская":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("ломтики ветчины")
					& choiseList.contains("сосиски") & choiseList.size() == 4) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/студенчиская.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Каруселька":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртая ветчина")
					& choiseList.contains("сосиски") & choiseList.contains("помидоры черри") & choiseList.size() == 5) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/каруселька.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Кораблик":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртая ветчина")
					& choiseList.contains("сосиски") & choiseList.contains("картофель фри")
					& choiseList.contains("свежий огурец") & choiseList.contains("помидоры черри")
					& choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/кораблик.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "ЭнгриБёрдс":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("салями")
					& choiseList.contains("маслины") & choiseList.contains("перец свежий")
					& choiseList.contains("отварное яйцо") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/энгри бёрдс.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Барбекю":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("ломтики бекона")
					& choiseList.contains("шампиньоны") & choiseList.contains("жаренная курица")
					& choiseList.contains("лук порей") & choiseList.contains("соус барбекю") & choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/барбек.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Боровик":
			if (choiseList.contains("соус сметанный с чесноком") & choiseList.contains("моцарела")
					& choiseList.contains("ломтики бекона") & choiseList.contains("шампиньоны")
					& choiseList.contains("боровики") & choiseList.contains("лук обычный")
					& choiseList.contains("лук порей") & choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/боровик.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Мясная":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("тёртая ветчина")
					& choiseList.contains("ломтики бекона") & choiseList.contains("копчённые колбаски")
					& choiseList.contains("колбаски пеперони") & choiseList.contains("перец халапенью")
					& choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/мясная.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Техас":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("ломтики бекона")
					& choiseList.contains("шампиньоны") & choiseList.contains("копчённые колбаски")
					& choiseList.contains("кукуруза") & choiseList.contains("перец свежий")
					& choiseList.contains("соус сырный") & choiseList.size() == 8) {

				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/техас.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Курица с пеперони":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("отбитая курица")
					& choiseList.contains("колбаски пеперони") & choiseList.contains("соус ранч")
					& choiseList.contains("ломтики помидор") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/курица с пеп.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Пигата с ветчиной":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("рукола")
					& choiseList.contains("листы салата") & choiseList.contains("соус майонез с зеленью")
					& choiseList.contains("сыр фета") & choiseList.contains("ломтики ветчины")
					& choiseList.contains("ломтики помидор") & choiseList.size() == 8) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/пигата с вет.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Пигата с курицей":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("ломтики помидор")
					& choiseList.contains("рукола") & choiseList.contains("листы салата")
					& choiseList.contains("соус цезарь") & choiseList.contains("жаренное куриное филе(холодный цех)")
					& choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/пигата с курицей.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "Пигата с говядиной":
			if (choiseList.contains("паста") & choiseList.contains("моцарела") & choiseList.contains("сыр чеддер")
					& choiseList.contains("ломтики помидор") & choiseList.contains("маринованные огурцы")
					& choiseList.contains("листы салата") & choiseList.contains("рукола")
					& choiseList.contains("начинка из говядины(говяжий фарш)") & choiseList.contains("красный лук")
					& choiseList.contains("соус сметанный с чесноком") & choiseList.size() == 10) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " Поздравляю , пицца, на удивление, удачно сорбрана  ";
				image = new Image("/img/пигата с говядиной.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "Ну, что сказать - пицца оказалась хитрее";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		}

		return answer;

	}

	private boolean display(String message, ImageView view) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setMinHeight(500);
		window.setMinWidth(500);

		Button btnYes = new Button("Вернуться");
		btnYes.setOnAction(event -> {

			answer = true;
			likeRandom();
			lblRandomName.setText(name);
			window.close();
			
		});
		Label label = new Label(message);
		label.setFont(Font.font(20));
		view.setFitHeight(280);
		view.setFitWidth(280);
		VBox louayt = new VBox(20);

		louayt.getChildren().addAll(view, label, btnYes);
		louayt.setAlignment(Pos.CENTER);

		Scene scene = new Scene(louayt);
		window.setScene(scene);

		window.showAndWait();
		return answer;
	}

	public void end() {
		if (index >= 37) {
			image = new Image("/img/end.jpg");
			view = new ImageView(image);
			display2(view);
			counWin = 0;
			counLoose = 0;
			counChoise = 0;
			lblCountWin.setText("" + counWin);
			lblCountChoise.setText("" + counChoise);
			lblCountLoose.setText("" + counLoose);
		}
	}

	private boolean display2(ImageView view) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setMinHeight(500);
		window.setMinWidth(500);

		Button btnYes = new Button("Вернуться");
		btnYes.setOnAction(event -> {

			answer = true;
			window.close();
		});
		index = 0;
		name = "" + list1.get(random);
		lblRandomName.setText(name);
		index++;

		String message = "Количество верных ответов : " + lblCountWin.getText() + "\nКоличество неудач : "
				+ lblCountLoose.getText() + "\nКоличество попыток : " +count;

		Label label = new Label(message);
		label.setFont(Font.font(20));
		view.setFitHeight(380);
		view.setFitWidth(500);
		VBox louayt = new VBox(20);

		louayt.getChildren().addAll(label, view, btnYes);
		louayt.setAlignment(Pos.CENTER);

		Scene scene = new Scene(louayt);
		window.setScene(scene);

		window.showAndWait();
		return answer;
	}
}
