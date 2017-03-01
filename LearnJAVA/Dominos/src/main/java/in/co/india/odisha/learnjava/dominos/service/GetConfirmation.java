package in.co.india.odisha.learnjava.dominos.service;


import in.co.india.odisha.learnjava.dominos.model.Confirmation;
import in.co.india.odisha.learnjava.dominos.model.Member;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by personal on 22-02-2017.
 */
@WebService
public class GetConfirmation {
    @WebMethod (operationName = "GetConfirmation")
  public Confirmation getConfirmation(Member member){
      Confirmation c=new Confirmation();
      c.setUserName("Y2345");
      c.setPassword("hgdmngg");
      return c;
  }



}
