import java.util.List;

public class GetId {
    public int GetId(List<Members> members, String userName){
        for (int i = 0; i < members.size(); i++) {
            if(userName.equalsIgnoreCase(members.get(i).userName)) return i;
        }
        return -1;
    }
}
