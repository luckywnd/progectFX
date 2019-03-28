package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class contr {
	boolean answer;
	Image image;
	ImageView view;
	String message;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Button btnSic;

	@FXML
	private Button btnRom;

	@FXML
	private Button btnDer;

	@FXML
	private Button btnPik;

	@FXML
	private Button btnTkyr;

	@FXML
	private Button btnTut;

	@FXML
	private Button btnRim;

	@FXML
	private Button btnOgn;

	@FXML
	private Button btnSor;

	@FXML
	private Button btnPov;

	@FXML
	private Button btnGre;

	@FXML
	private Button btnPal;

	@FXML
	private Button btnPep;

	@FXML
	private Button btnTsvin;

	@FXML
	private Label lblName;

	@FXML
	private Button btn4Season;

	@FXML
	private Button btnOso;

	@FXML
	private Button btnMarin;

	@FXML
	private Button btnKorab;

	@FXML
	private Button btnTvet;

	@FXML
	private Button btnAngry;

	@FXML
	private Button btnStu;

	@FXML
	private Button btnGav;

	@FXML
	private Button btnGri;

	@FXML
	private Button btnBar;

	@FXML
	private Button btnPigVet;

	@FXML
	private Button btnPigKyr;

	@FXML
	private Button btnPigGov;

	@FXML
	private Button btnBor;

	@FXML
	private Button btnKyrspep;

	@FXML
	private Button btnTex;

	@FXML
	private Button btnMas;

	@FXML
	private Button btnMar;

	@FXML
	private Button btnVen;

	@FXML
	private Button btnNar;

	@FXML
	private Button btnKarys;

	@FXML
	private Button btnApp;

	@FXML
	private Button btnOxo;

	@FXML
	private Button btnFlo;

	@FXML
	private Button btnVez;

	private boolean display(String title, String message, ImageView view) {
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle(title);
		window.setMinHeight(500);
		window.setMinWidth(500);

		Button btnYes = new Button("Вернуться");
		btnYes.setOnAction(event -> {
			/*
			 * устанавливаем флаг на "+" и закрываем окно
			 */
			answer = true;
			window.close();
		});
		Label label = new Label(message);
		label.setFont(Font.font(20));
		view.setFitHeight(280);
		view.setFitWidth(280);
		VBox louayt = new VBox(20);
		/*
		 * порядок дабавления тоже важен
		 */
		louayt.getChildren().addAll(view, label, btnYes);
		louayt.setAlignment(Pos.CENTER);

		Scene scene = new Scene(louayt);
		window.setScene(scene);
		/*
		 * не просто показать , но и подождать изменений иначе будет отображать в
		 * консоле стартовое значение флага и его изменение за прошлый ход
		 */
		window.showAndWait();
		return answer;
	}

	@FXML
	void initialize() {
		btn4Season.setOnAction(event -> {
			image = new Image("/img/4 сезона.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:\n"
					+ "1 - паста;\n2 - моцарела;\n3 - тёртая ветчина;\n4 - шампиньёны;\n5 - криветки;\n6 - мидии"
					+ "\n\t\tУкрашение :";
			display("4 Сезона", message, view);

		});
		btnApp.setOnAction(event -> {
			image = new Image("/img/аппетитная.jpg");
			view = new ImageView(image);
			message = "\t\tСостав :" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртый бекон;"
					+ "\n4 -> жаренное куриное филе;" + "\n5 -> соус барбекю;" + "\n\t\tУкрашение :"
					+ "\n помидоры черри.";
			display("Аппетитная", message, view);
		});
		btnVez.setOnAction(event -> {
			image = new Image("/img/везувий.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> ломтики ветчины"
					+ "\n\t\tУкрашение : ";
			display("Везувий", message, view);
		});
		btnVen.setOnAction(event -> {
			image = new Image("/img/венецианская.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртая ветчина;"
					+ "\n4 -> криветки;" + "\n\t\tУкрашение : " + "\n ломтики лемона.";
			display("Венецианская", message, view);
		});
		btnGav.setOnAction(event -> {
			image = new Image("/img/гавайская.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртая ветчина;"
					+ "\n4 -> кусочки ананаса" + "\n\t\tУкрашение : ";
			display("Гавайская", message, view);
		});
		btnGre.setOnAction(event -> {
			image = new Image("/img/греческая.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> шпинат;" + "\n4 -> фета;"
					+ "\n5 ->соус сметанный с чесноком;" + "\n\t\tУкрашение : " + "\nпомидоры черри";
			display("Греческая", message, view);
		});
		btnGri.setOnAction(event -> {
			image = new Image("/img/грибная.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> шампиньёны" + "\n\t\tУкрашение :";
			display("грибная", message, view);
		});
		btnDer.setOnAction(event -> {
			image = new Image("/img/деревенская.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> ломтики бекона;"
					+ "\n4 -> лук кольцами;" + "\n5 -> взбитое яйцо" + "\n\t\tУкрашение :" + "\nмаринованные огурцы";
			display("Деревенская", message, view);
		});
		btnMar.setOnAction(event -> {
			image = new Image("/img/маргарита.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n\t\tУкрашение :";
			display("Маргарита", message, view);
		});
		btnMarin.setOnAction(event -> {
			image = new Image("/img/маринара.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> копчённый лосось;"
					+ "\n4 -> криветки;" + "\n\t\tУкрашение :" + "\nломтики лемона" + "\n каперсы";
			display("Маринара", message, view);
		});
		btnNar.setOnAction(event -> {
			image = new Image("/img/народная.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртая ветчина;"
					+ "\n4 -> шампиньёны;" + "\n\t\tУкрашение :" + "\nмаринованные огурцы";
			display("Народная", message, view);
		});
		btnOgn.setOnAction(event -> {
			image = new Image("/img/огненая.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртый бекон;"
					+ "\n4 -> свинина отварная;" + "\n5 -> соуз из хрена;" + "\n6 -> соус Сальса;"
					+ "\n7 -> кайенский перец" + "\n\t\tУкрашение :" + "\nперец Халапенью" + "\nперец Чили"
					+ "\nконсервированный лук";
			display("Огненная", message, view);
		});
		btnOso.setOnAction(event -> {
			image = new Image("/img/особенная.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртая ветчина;"
					+ "\n4 -> шампиньёны" + "\n5 -> салями" + "\n\t\tУкрашение :" + "\nперец Халапенью" + "\nмаслины";
			display("Особенная", message, view);
		});
		btnOxo.setOnAction(event -> {
			image = new Image("/img/охотничья.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 ->лук кольцами;"
					+ "\n4 -> шампиньёны;" + "\n5 -> ломтики бекона" + "\n6 -> отбитая говядина;" + "\n7 -> соус Сальса"
					+ "\n8 -> Тако" + "\n\t\tУкрашение :" + "\nперец Чили";
			display("Охотничья", message, view);
		});
		btnPal.setOnAction(event -> {
			image = new Image("/img/палитра сыров.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> сыр джугас;" + "\n4 -> сыр фета"
					+ "\n5 -> сыр дорблю" + "\n\t\tУкрашение :" + "\nпомидоры черри" + "\nмаслины";
			display("Палитра сыров", message, view);
		});
		btnPep.setOnAction(event -> {
			image = new Image("/img/пеперони.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртая ветчина;"
					+ "\n4 -> лук кольцами;" + "\n5 -> перец консервированный" + "\n5 -> салями;" + "\n\t\tУкрашение :"
					+ "\nперец Чили" + "\nперец Пеперони";
			display("Пеперони", message, view);
		});
		btnPov.setOnAction(event -> {
			image = new Image("/img/повседневная.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> салями" + "\n\t\tУкрашение :"
					+ "\nломтики помидор";
			display("Повседневная", message, view);
		});
		btnPik.setOnAction(event -> {
			image = new Image("/img/пикантная.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> отбитое куринное филе"
					+ "\n4 -> кусочки ананаса" + "\n\t\tУкрашение :";
			display("Пикантная", message, view);
		});
		btnRim.setOnAction(event -> {
			image = new Image("/img/римская.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртый бекон"
					+ "\n4 -> жаренное куринное филе" + "\n5 -> соус сырный" + "\n\t\tУкрашение :"
					+ "\nмаринованные огурцы";
			display("Римская", message, view);
		});
		btnRom.setOnAction(event -> {
			image = new Image("/img/ромео.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртая ветчина"
					+ "\n4 -> отбитая свинина" + "\n5 -> соус ранч" + "\n\t\tУкрашение :";
			display("Ромео", message, view);
		});
		btnSic.setOnAction(event -> {
			image = new Image("/img/сицилийская.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> шампиньёны"
					+ "\n4 -> отбитое куриное филе" + "\n\t\tУкрашение :" + "\nперец Чили" + "\nперец Пеперони";
			display("Сицилийская", message, view);
		});
		btnSor.setOnAction(event -> {
			image = new Image("/img/соренто.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3-> ломтики бекона"
					+ "\n4 -> говядина копчёная" + "\n5 -> соус барбекю" + "\n6 -> перец консервированный"
					+ "\n\t\tУкрашение :";
			display("Соренто", message, view);
		});
		btnTvet.setOnAction(event -> {
			image = new Image("/img/толстушка с вет.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> ломтики ветчины"
					+ "\n4 -> шампиньёны" + "\n5 ->  маслины" + "\n\t\tУкрашение :";
			display("Толстушка с ветчиной", message, view);
		});
		btnTkyr.setOnAction(event -> {
			image = new Image("/img/толстушка с курицей.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> жаренное куриное филе"
					+ "\n4 -> шампиньёны" + "\n5 -> помидоры свежие" + "\n6 -> лук порей кольцами"
					+ "\n\t\tУкрашение :";
			display("Толстушка с курицей", message, view);
		});
		btnTsvin.setOnAction(event -> {
			image = new Image("/img/толстушка со свининой.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> ломтики бекона"
					+ "\n4 -> отворная свинина" + "\n5 -> помидоры свежие" + "\n6 -> перец Халапенью"
					+ "\n\t\tУкрашение :";
			display("Толстушка со свининой", message, view);
		});
		btnStu.setOnAction(event -> {
			image = new Image("/img/студенчиская.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> ломтики ветчины" + "\n4 -> сосиски"
					+ "\n\t\tУкрашение :";
			display("Студенчиская", message, view);
		});
		btnTut.setOnAction(event -> {
			image = new Image("/img/тут бай.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртый бекон" + "\n4 -> салями"
					+ "\n5 -> соус сметанный с чесноком" + "\n\t\tУкрашение :" + "\nломтики помидор";
			display("ТутБай", message, view);
		});
		btnFlo.setOnAction(event -> {
			image = new Image("/img/флорентийская.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртая ветчина"
					+ "\n4 ->отбитая свинина" + "\n5 -> лук порей" + "\n6 -> мариннованые опята" + "\n7 -> соус ранч"
					+ "\n\t\tУкрашение :";
			display("Флорентийская", message, view);
		});
		btnKarys.setOnAction(event -> {
			image = new Image("/img/каруселька.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртая ветчина" + "\n4 -> сосиски"
					+ "\n\t\tУкрашение :" + "\nпомидоры черри";
			display("Каруселька", message, view);
		});
		btnAngry.setOnAction(event -> {
			image = new Image("/img/энгри бёрдс.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> салями" + "\n\t\tУкрашение :"
					+ "\n маслины" + "\n2 половинки отворного яйца" + "\nперец свежий";
			display("AngryBirds", message, view);
		});
		btnKorab.setOnAction(event -> {
			image = new Image("/img/кораблик.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртая ветчина" + "\n4 -> сосиски"
					+ "\n\t\tУкрашение :" + "\nкортофель фри" + "\nпомидоры чери" + "\nсвежий огурец";
			display("Кораблик", message, view);
		});
		btnBar.setOnAction(event -> {
			image = new Image("/img/барбек.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> ломтики бекона"
					+ "\n4 -> шампиньоны" + "\n5 -> жаренное куриное филе" + "\n6 -> лук порей кольцами"
					+ "\n7 -> соус барбекю" + "\n\t\tУкрашение :";
			display("Барбекю", message, view);
		});
		btnBor.setOnAction(event -> {
			image = new Image("/img/боровик.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> соус сметанный с чесноком;" + "\n2 -> моцарела;" + "\n3 -> ломтики бекона"
					+ "\n4 -> шампиньоны" + "\n5 -> боровики" + "\n6 -> лук кольцами" + "\n7 -> лук порей"
					+ "\n\t\tУкрашение :";
			display("Боровик", message, view);
		});
		btnKyrspep.setOnAction(event -> {
			image = new Image("/img/курица с пеп.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> отбитое куриное филе"
					+ "\n4 ->колбаски пеперони" + "\n5 -> соус ранч" + "\n\t\tУкрашение :" + "\nломтики помидор";
			display("Курица с пеперони", message, view);
		});
		btnMas.setOnAction(event -> {
			image = new Image("/img/мясная.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> тёртая ветчина"
					+ "\n4 -> ломтики бекона" + "\n5 -> колбаски копчёные" + "\n6 -> колбаски пеперони"
					+ "\n\t\tУкрашение :" + "\nперец Халапенью";
			display("Мясная", message, view);
		});
		btnTex.setOnAction(event -> {
			image = new Image("/img/техас.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> ломтики бекона"
					+ "\n4 -> шампиньоны" + "\n5 -> колбаски копчёные" + "\n6 -> сырный соус" + "\n\t\tУкрашение :"
					+ "\nперец свежий" + "\nкукуруза";
			display("Техас", message, view);
		});
		btnPigVet.setOnAction(event -> {
			image = new Image("/img/пигата с вет.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 -> ломтики ветчины"
					+ "\n4 -> сыр фета" + "\n5 -> ломтики помидор" + "\n6 -> рукола" + "\n7 -> листы салата"
					+ "\n8 -> соус майонез с зеленью";
			display("Пигата с ветчиной", message, view);
		});
		btnPigKyr.setOnAction(event -> {
			image = new Image("/img/пигата с курицей.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;"
					+ "\n3 -> жаренное куриное филе ( холодный цех)" + "\n4 -> ломтики помидор" + "\n5 -> рукола"
					+ "\n6 -> листья салата" + "\n7 -> соус цезарь";
			display("Пигата с курицей", message, view);
		});
		btnPigGov.setOnAction(event -> {
			image = new Image("/img/пигата с говядиной.jpg");
			view = new ImageView(image);
			message = "\t\tСостав:" + "\n1 -> паста;" + "\n2 -> моцарела;" + "\n3 ->начинка из говядины(говяжий фарш)"
					+ "\n4 -> сыр Чеддер" + "\n5 -> ломтики помидор" + "\n6 -> маринованные огурцы" + "\n7 -> рукола"
					+ "\n8 -> листы салата" + "\n9 -> красный лук кольцами" + "\n10 ->соус сметанный с чесноком";
			display("Пигата с говядиной", message, view);
		});

	}
}
