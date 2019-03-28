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

	ObservableList<String> resName = FXCollections.observableArrayList("�����", "��������", "����� �������",
			"������� �������", "������� ������", "����� �����", "��� �������", "��� �����", "����������",
			"������������ �����", "��������", "������", "��������� ��������", "�������", "�������� ��������",
			"������� ��������", "�������� ������", "������� ������", "������� �������", "������� ��������",
			"�������� ��������", "���������������� �����", "������", "��� ����", "��� ������", "��� ������",
			"��� ������", "��������", "�����", "������", "������� ����", "������� �� ��������(������� ����)",
			"���� ���������", "���� ����", "���� �������", "���� ��������� � ��������", "�������� ����",
			"�������� ����", "�������� ��������� �����", "������� �������", "���� ������", "���� ������� � �������",
			"���� ������");

	ObservableList<String> decName = FXCollections.observableArrayList("������� �������", "�������", "�����",
			"�������� �����", "����� ������", "����� ����", "������� ���", "����� ���������", "����� ��������",
			"������������ ������", "��������", "���������������� ���", "�������", "��������� ���", "������ ������",
			"�������� ����", "������", "����� ������", "�������� ������� ����(�������� ���)");

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

		list1.add("4 ������");
		list1.add("����������");
		list1.add("�������");
		list1.add("���������");
		list1.add("���������");
		list1.add("�������");
		list1.add("�����������");
		list1.add("���������");
		list1.add("��������");
		list1.add("��������");
		list1.add("���������");
		list1.add("���������");
		list1.add("������� �����");
		list1.add("��������");
		list1.add("���������");
		list1.add("������������");
		list1.add("�������");
		list1.add("�����");
		list1.add("�����������");
		list1.add("�������");
		list1.add("��������� � ��������");
		list1.add("��������� � �������");
		list1.add("��������� �� ��������");
		list1.add("������");
		list1.add("�������������");
		list1.add("������������");
		list1.add("�������");
		list1.add("�������");
		list1.add("������");
		list1.add("�����");
		list1.add("��������");
		list1.add("����������");
		list1.add("����������");
		list1.add("������ � ��������");
		list1.add("������ � �������");
		list1.add("������ � ���������");
		list1.add("��������");
		list1.add("������ � ��������");
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
		case "�������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� �������")
					& choiseList.size() == 3) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;

			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}

		case "����������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �����")
					& choiseList.contains("�������� ������") & choiseList.contains("���� �������")
					& choiseList.contains("�������� �����") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/����������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}

		case "4 ������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����������")
					& choiseList.contains("����� �������") & choiseList.contains("��������")
					& choiseList.contains("�����") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/4 ������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}

		case "������������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �������")
					& choiseList.contains("��������") & choiseList.contains("�����") & choiseList.size() == 5) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/������������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "���������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �������")
					& choiseList.contains("������� �������") & choiseList.size() == 4) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/���������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "���������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("��� ����")
					& choiseList.contains("������") & choiseList.contains("���� ��������� � ��������")
					& choiseList.contains("�������� �����") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/���������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "�������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����������")
					& choiseList.size() == 3) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "�����������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� ������")
					& choiseList.contains("��� �������") & choiseList.contains("������������ ������")
					& choiseList.contains("������� ����") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�����������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "���������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.size() == 2) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/���������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "��������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������")
					& choiseList.contains("��������") & choiseList.contains("�����") & choiseList.contains("�������")
					& choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/��������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "��������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �������")
					& choiseList.contains("����������") & choiseList.contains("������������ ������")
					& choiseList.size() == 5) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/��������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "��������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �����")
					& choiseList.contains("������� ��������") & choiseList.contains("���� ���������")
					& choiseList.contains("�������� ����") & choiseList.contains("�������� ��������� �����")
					& choiseList.contains("����� ����") & choiseList.contains("����� ���������")
					& choiseList.contains("���������������� ���") & choiseList.size() == 10) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "���������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �������")
					& choiseList.contains("����������") & choiseList.contains("������") & choiseList.contains("�������")
					& choiseList.contains("����� ���������") & choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/���������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "���������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� ������")
					& choiseList.contains("��� �������") & choiseList.contains("���� ���������")
					& choiseList.contains("�������� ����") & choiseList.contains("������� ��������")
					& choiseList.contains("����������") & choiseList.contains("����� ����") & choiseList.size() == 9) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/���������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "������� �����":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("��� ������")
					& choiseList.contains("��� ������") & choiseList.contains("��� ����")
					& choiseList.contains("�������� �����") & choiseList.contains("�������") & choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/������� �����.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "��������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �������")
					& choiseList.contains("��� �������") & choiseList.contains("������")
					& choiseList.contains("���������������� �����") & choiseList.contains("����� ����")
					& choiseList.contains("����� ��������") & choiseList.size() == 8) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/��������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "���������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� ������")
					& choiseList.contains("������� �������") & choiseList.size() == 4) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/���������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "������������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������")
					& choiseList.contains("������� �������") & choiseList.size() == 4) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/������������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "�������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �����")
					& choiseList.contains("�������� ������") & choiseList.contains("���� ������")
					& choiseList.contains("������������ ������") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "�����":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �������")
					& choiseList.contains("������� �������") & choiseList.contains("���� ����")
					& choiseList.size() == 5) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�����.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "�����������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� ������")
					& choiseList.contains("����������") & choiseList.contains("����� ����")
					& choiseList.contains("����� ��������") & choiseList.size() == 6) {

				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�����������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "�������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� ������")
					& choiseList.contains("�������� ��������") & choiseList.contains("���� �������")
					& choiseList.contains("���������������� �����") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "��������� � ��������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� �������")
					& choiseList.contains("����������") & choiseList.contains("�������") & choiseList.size() == 5) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/��������� � ���.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "��������� � �������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("�������� ������")
					& choiseList.contains("����������") & choiseList.contains("������� �������")
					& choiseList.contains("��� �����") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/��������� � �������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "��������� �� ��������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� ������")
					& choiseList.contains("������� ��������") & choiseList.contains("������� �������")
					& choiseList.contains("����� ���������") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/��������� �� ��������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �����")
					& choiseList.contains("������") & choiseList.contains("���� ��������� � ��������")
					& choiseList.contains("������� �������") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/��� ���.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "�������������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �������")
					& choiseList.contains("������� �������") & choiseList.contains("��� �����")
					& choiseList.contains("���� ����") & choiseList.contains("������������ �����")
					& choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�������������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "������������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� �������")
					& choiseList.contains("�������") & choiseList.size() == 4) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/������������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "����������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �������")
					& choiseList.contains("�������") & choiseList.contains("�������� �����") & choiseList.size() == 5) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/����������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "��������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �������")
					& choiseList.contains("�������") & choiseList.contains("��������� ���")
					& choiseList.contains("������ ������") & choiseList.contains("�������� �����")
					& choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/��������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "����������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������")
					& choiseList.contains("�������") & choiseList.contains("����� ������")
					& choiseList.contains("�������� ����") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/����� ����.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "�������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� ������")
					& choiseList.contains("����������") & choiseList.contains("�������� ������")
					& choiseList.contains("��� �����") & choiseList.contains("���� �������") & choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "�������":
			if (choiseList.contains("���� ��������� � ��������") & choiseList.contains("��������")
					& choiseList.contains("������� ������") & choiseList.contains("����������")
					& choiseList.contains("��������") & choiseList.contains("��� �������")
					& choiseList.contains("��� �����") & choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("����� �������")
					& choiseList.contains("������� ������") & choiseList.contains("��������� ��������")
					& choiseList.contains("�������� ��������") & choiseList.contains("����� ���������")
					& choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "�����":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� ������")
					& choiseList.contains("����������") & choiseList.contains("��������� ��������")
					& choiseList.contains("��������") & choiseList.contains("����� ������")
					& choiseList.contains("���� ������") & choiseList.size() == 8) {

				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/�����.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "������ � ��������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� ������")
					& choiseList.contains("�������� ��������") & choiseList.contains("���� ����")
					& choiseList.contains("������� �������") & choiseList.size() == 6) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/������ � ���.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "������ � ��������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������")
					& choiseList.contains("����� ������") & choiseList.contains("���� ������� � �������")
					& choiseList.contains("��� ����") & choiseList.contains("������� �������")
					& choiseList.contains("������� �������") & choiseList.size() == 8) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/������ � ���.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "������ � �������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("������� �������")
					& choiseList.contains("������") & choiseList.contains("����� ������")
					& choiseList.contains("���� ������") & choiseList.contains("�������� ������� ����(�������� ���)")
					& choiseList.size() == 7) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/������ � �������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
				image = new Image("/img/looser.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			}
		case "������ � ���������":
			if (choiseList.contains("�����") & choiseList.contains("��������") & choiseList.contains("��� ������")
					& choiseList.contains("������� �������") & choiseList.contains("������������ ������")
					& choiseList.contains("����� ������") & choiseList.contains("������")
					& choiseList.contains("������� �� ��������(������� ����)") & choiseList.contains("������� ���")
					& choiseList.contains("���� ��������� � ��������") & choiseList.size() == 10) {
				counWin++;
				counChoise++;
				answer = true;
				lblCountChoise.setText("" + counChoise);
				lblCountWin.setText("" + counWin);
				message = " ���������� , �����, �� ���������, ������ ��������  ";
				image = new Image("/img/������ � ���������.jpg");
				view = new ImageView(image);
				display(message, view);
				return answer;
			} else {
				counChoise++;
				answer = false;
				counLoose++;
				lblCountChoise.setText("" + counChoise);
				lblCountLoose.setText("" + counLoose);
				message = "��, ��� ������� - ����� ��������� ������";
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

		Button btnYes = new Button("���������");
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

		Button btnYes = new Button("���������");
		btnYes.setOnAction(event -> {

			answer = true;
			window.close();
		});
		index = 0;
		name = "" + list1.get(random);
		lblRandomName.setText(name);
		index++;

		String message = "���������� ������ ������� : " + lblCountWin.getText() + "\n���������� ������ : "
				+ lblCountLoose.getText() + "\n���������� ������� : " +count;

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
