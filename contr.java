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

		Button btnYes = new Button("���������");
		btnYes.setOnAction(event -> {
			/*
			 * ������������� ���� �� "+" � ��������� ����
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
		 * ������� ���������� ���� �����
		 */
		louayt.getChildren().addAll(view, label, btnYes);
		louayt.setAlignment(Pos.CENTER);

		Scene scene = new Scene(louayt);
		window.setScene(scene);
		/*
		 * �� ������ �������� , �� � ��������� ��������� ����� ����� ���������� �
		 * ������� ��������� �������� ����� � ��� ��������� �� ������� ���
		 */
		window.showAndWait();
		return answer;
	}

	@FXML
	void initialize() {
		btn4Season.setOnAction(event -> {
			image = new Image("/img/4 ������.jpg");
			view = new ImageView(image);
			message = "\t\t������:\n"
					+ "1 - �����;\n2 - ��������;\n3 - ����� �������;\n4 - ����������;\n5 - ��������;\n6 - �����"
					+ "\n\t\t��������� :";
			display("4 ������", message, view);

		});
		btnApp.setOnAction(event -> {
			image = new Image("/img/����������.jpg");
			view = new ImageView(image);
			message = "\t\t������ :" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �����;"
					+ "\n4 -> �������� ������� ����;" + "\n5 -> ���� �������;" + "\n\t\t��������� :"
					+ "\n �������� �����.";
			display("����������", message, view);
		});
		btnVez.setOnAction(event -> {
			image = new Image("/img/�������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������� �������"
					+ "\n\t\t��������� : ";
			display("�������", message, view);
		});
		btnVen.setOnAction(event -> {
			image = new Image("/img/������������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �������;"
					+ "\n4 -> ��������;" + "\n\t\t��������� : " + "\n ������� ������.";
			display("������������", message, view);
		});
		btnGav.setOnAction(event -> {
			image = new Image("/img/���������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �������;"
					+ "\n4 -> ������� �������" + "\n\t\t��������� : ";
			display("���������", message, view);
		});
		btnGre.setOnAction(event -> {
			image = new Image("/img/���������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������;" + "\n4 -> ����;"
					+ "\n5 ->���� ��������� � ��������;" + "\n\t\t��������� : " + "\n�������� �����";
			display("���������", message, view);
		});
		btnGri.setOnAction(event -> {
			image = new Image("/img/�������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����������" + "\n\t\t��������� :";
			display("�������", message, view);
		});
		btnDer.setOnAction(event -> {
			image = new Image("/img/�����������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������� ������;"
					+ "\n4 -> ��� ��������;" + "\n5 -> ������� ����" + "\n\t\t��������� :" + "\n������������ ������";
			display("�����������", message, view);
		});
		btnMar.setOnAction(event -> {
			image = new Image("/img/���������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n\t\t��������� :";
			display("���������", message, view);
		});
		btnMarin.setOnAction(event -> {
			image = new Image("/img/��������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ��������� ������;"
					+ "\n4 -> ��������;" + "\n\t\t��������� :" + "\n������� ������" + "\n �������";
			display("��������", message, view);
		});
		btnNar.setOnAction(event -> {
			image = new Image("/img/��������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �������;"
					+ "\n4 -> ����������;" + "\n\t\t��������� :" + "\n������������ ������";
			display("��������", message, view);
		});
		btnOgn.setOnAction(event -> {
			image = new Image("/img/�������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �����;"
					+ "\n4 -> ������� ��������;" + "\n5 -> ���� �� �����;" + "\n6 -> ���� ������;"
					+ "\n7 -> ��������� �����" + "\n\t\t��������� :" + "\n����� ���������" + "\n����� ����"
					+ "\n���������������� ���";
			display("��������", message, view);
		});
		btnOso.setOnAction(event -> {
			image = new Image("/img/���������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �������;"
					+ "\n4 -> ����������" + "\n5 -> ������" + "\n\t\t��������� :" + "\n����� ���������" + "\n�������";
			display("���������", message, view);
		});
		btnOxo.setOnAction(event -> {
			image = new Image("/img/���������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 ->��� ��������;"
					+ "\n4 -> ����������;" + "\n5 -> ������� ������" + "\n6 -> ������� ��������;" + "\n7 -> ���� ������"
					+ "\n8 -> ����" + "\n\t\t��������� :" + "\n����� ����";
			display("���������", message, view);
		});
		btnPal.setOnAction(event -> {
			image = new Image("/img/������� �����.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ��� ������;" + "\n4 -> ��� ����"
					+ "\n5 -> ��� ������" + "\n\t\t��������� :" + "\n�������� �����" + "\n�������";
			display("������� �����", message, view);
		});
		btnPep.setOnAction(event -> {
			image = new Image("/img/��������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �������;"
					+ "\n4 -> ��� ��������;" + "\n5 -> ����� ����������������" + "\n5 -> ������;" + "\n\t\t��������� :"
					+ "\n����� ����" + "\n����� ��������";
			display("��������", message, view);
		});
		btnPov.setOnAction(event -> {
			image = new Image("/img/������������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������" + "\n\t\t��������� :"
					+ "\n������� �������";
			display("������������", message, view);
		});
		btnPik.setOnAction(event -> {
			image = new Image("/img/���������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������� �������� ����"
					+ "\n4 -> ������� �������" + "\n\t\t��������� :";
			display("���������", message, view);
		});
		btnRim.setOnAction(event -> {
			image = new Image("/img/�������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �����"
					+ "\n4 -> �������� �������� ����" + "\n5 -> ���� ������" + "\n\t\t��������� :"
					+ "\n������������ ������";
			display("�������", message, view);
		});
		btnRom.setOnAction(event -> {
			image = new Image("/img/�����.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �������"
					+ "\n4 -> ������� �������" + "\n5 -> ���� ����" + "\n\t\t��������� :";
			display("�����", message, view);
		});
		btnSic.setOnAction(event -> {
			image = new Image("/img/�����������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����������"
					+ "\n4 -> ������� ������� ����" + "\n\t\t��������� :" + "\n����� ����" + "\n����� ��������";
			display("�����������", message, view);
		});
		btnSor.setOnAction(event -> {
			image = new Image("/img/�������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3-> ������� ������"
					+ "\n4 -> �������� ��������" + "\n5 -> ���� �������" + "\n6 -> ����� ����������������"
					+ "\n\t\t��������� :";
			display("�������", message, view);
		});
		btnTvet.setOnAction(event -> {
			image = new Image("/img/��������� � ���.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������� �������"
					+ "\n4 -> ����������" + "\n5 ->  �������" + "\n\t\t��������� :";
			display("��������� � ��������", message, view);
		});
		btnTkyr.setOnAction(event -> {
			image = new Image("/img/��������� � �������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> �������� ������� ����"
					+ "\n4 -> ����������" + "\n5 -> �������� ������" + "\n6 -> ��� ����� ��������"
					+ "\n\t\t��������� :";
			display("��������� � �������", message, view);
		});
		btnTsvin.setOnAction(event -> {
			image = new Image("/img/��������� �� ��������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������� ������"
					+ "\n4 -> �������� �������" + "\n5 -> �������� ������" + "\n6 -> ����� ���������"
					+ "\n\t\t��������� :";
			display("��������� �� ��������", message, view);
		});
		btnStu.setOnAction(event -> {
			image = new Image("/img/������������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������� �������" + "\n4 -> �������"
					+ "\n\t\t��������� :";
			display("������������", message, view);
		});
		btnTut.setOnAction(event -> {
			image = new Image("/img/��� ���.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �����" + "\n4 -> ������"
					+ "\n5 -> ���� ��������� � ��������" + "\n\t\t��������� :" + "\n������� �������";
			display("������", message, view);
		});
		btnFlo.setOnAction(event -> {
			image = new Image("/img/�������������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �������"
					+ "\n4 ->������� �������" + "\n5 -> ��� �����" + "\n6 -> ������������ �����" + "\n7 -> ���� ����"
					+ "\n\t\t��������� :";
			display("�������������", message, view);
		});
		btnKarys.setOnAction(event -> {
			image = new Image("/img/����������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �������" + "\n4 -> �������"
					+ "\n\t\t��������� :" + "\n�������� �����";
			display("����������", message, view);
		});
		btnAngry.setOnAction(event -> {
			image = new Image("/img/����� ����.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������" + "\n\t\t��������� :"
					+ "\n �������" + "\n2 ��������� ��������� ����" + "\n����� ������";
			display("AngryBirds", message, view);
		});
		btnKorab.setOnAction(event -> {
			image = new Image("/img/��������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �������" + "\n4 -> �������"
					+ "\n\t\t��������� :" + "\n��������� ���" + "\n�������� ����" + "\n������ ������";
			display("��������", message, view);
		});
		btnBar.setOnAction(event -> {
			image = new Image("/img/������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������� ������"
					+ "\n4 -> ����������" + "\n5 -> �������� ������� ����" + "\n6 -> ��� ����� ��������"
					+ "\n7 -> ���� �������" + "\n\t\t��������� :";
			display("�������", message, view);
		});
		btnBor.setOnAction(event -> {
			image = new Image("/img/�������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> ���� ��������� � ��������;" + "\n2 -> ��������;" + "\n3 -> ������� ������"
					+ "\n4 -> ����������" + "\n5 -> ��������" + "\n6 -> ��� ��������" + "\n7 -> ��� �����"
					+ "\n\t\t��������� :";
			display("�������", message, view);
		});
		btnKyrspep.setOnAction(event -> {
			image = new Image("/img/������ � ���.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������� ������� ����"
					+ "\n4 ->�������� ��������" + "\n5 -> ���� ����" + "\n\t\t��������� :" + "\n������� �������";
			display("������ � ��������", message, view);
		});
		btnMas.setOnAction(event -> {
			image = new Image("/img/������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ����� �������"
					+ "\n4 -> ������� ������" + "\n5 -> �������� ��������" + "\n6 -> �������� ��������"
					+ "\n\t\t��������� :" + "\n����� ���������";
			display("������", message, view);
		});
		btnTex.setOnAction(event -> {
			image = new Image("/img/�����.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������� ������"
					+ "\n4 -> ����������" + "\n5 -> �������� ��������" + "\n6 -> ������ ����" + "\n\t\t��������� :"
					+ "\n����� ������" + "\n��������";
			display("�����", message, view);
		});
		btnPigVet.setOnAction(event -> {
			image = new Image("/img/������ � ���.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 -> ������� �������"
					+ "\n4 -> ��� ����" + "\n5 -> ������� �������" + "\n6 -> ������" + "\n7 -> ����� ������"
					+ "\n8 -> ���� ������� � �������";
			display("������ � ��������", message, view);
		});
		btnPigKyr.setOnAction(event -> {
			image = new Image("/img/������ � �������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;"
					+ "\n3 -> �������� ������� ���� ( �������� ���)" + "\n4 -> ������� �������" + "\n5 -> ������"
					+ "\n6 -> ������ ������" + "\n7 -> ���� ������";
			display("������ � �������", message, view);
		});
		btnPigGov.setOnAction(event -> {
			image = new Image("/img/������ � ���������.jpg");
			view = new ImageView(image);
			message = "\t\t������:" + "\n1 -> �����;" + "\n2 -> ��������;" + "\n3 ->������� �� ��������(������� ����)"
					+ "\n4 -> ��� ������" + "\n5 -> ������� �������" + "\n6 -> ������������ ������" + "\n7 -> ������"
					+ "\n8 -> ����� ������" + "\n9 -> ������� ��� ��������" + "\n10 ->���� ��������� � ��������";
			display("������ � ���������", message, view);
		});

	}
}
