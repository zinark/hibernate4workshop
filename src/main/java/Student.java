import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    int _Id;
    String _Name;

    @Id
    public int get_Id() {
        return _Id;
    }

    public void set_Id(int _Id) {
        this._Id = _Id;
    }

    public String get_Name() {
        return _Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }
}
