module veterinaria {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	requires javafx.base;
	
	opens visao to javafx.graphics, javafx.fxml;
	
	////////////////////////
	exports dominio;
}
