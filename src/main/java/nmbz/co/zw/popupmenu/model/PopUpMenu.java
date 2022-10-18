package nmbz.co.zw.popupmenu.model;
    import javax.persistence.*;

    import lombok.Data.*;
    import lombok.Getter;
    import lombok.Setter;
    import lombok.ToString;
//mark class as an Entity

    @Getter
    @Setter
    @ToString
    @Entity  
    //defining class name as Table name  
    @Table
    public class PopUpMenu {
        //Defining book id as primary key
        @Id
        @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column
        private String title;
        @Column
        private String description;
        @Column
        private Boolean status;
        @Column
        private String callToActionLink;
        @Column
        private String callToActionText;
        @Column
        private String background;
        @Column
        private String background_contrast;
    }  