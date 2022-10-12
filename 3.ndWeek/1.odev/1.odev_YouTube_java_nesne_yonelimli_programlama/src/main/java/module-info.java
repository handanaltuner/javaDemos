module com.example.youtube_java_nesne_yonelimli_programlama {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.youtube_java_nesne_yonelimli_programlama to javafx.fxml;
    exports com.example.youtube_java_nesne_yonelimli_programlama;
}