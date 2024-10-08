module appli.todolistjx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires spring.security.core;
    requires spring.security.crypto;

    opens appli to javafx.fxml;
    exports appli;
    exports appli.accueil;
    opens appli.accueil to javafx.fxml;
}