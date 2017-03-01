package in.co.india.odisha.learnjava.service;

import in.co.india.odisha.learnjava.model.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by personal on 28-02-2017.
 */
public class MessageService {
    public List<Message> getAllMessages(){
        Message m1=new Message(1l,"Hiiii","Sini");
        Message m2=new Message(2l,"byee","Sini");
        List<Message> list=new ArrayList<>();
        list.add(m1);
        list.add(m2);
        return list;
    }
}
