package nmbz.co.zw.popupmenu.repository;
    import nmbz.co.zw.popupmenu.model.PopUpMenu;
    import org.springframework.data.repository.CrudRepository;
    //repository that extends CrudRepository  
    public interface PopUpRepo extends CrudRepository<PopUpMenu, Long>
    {  
    }  