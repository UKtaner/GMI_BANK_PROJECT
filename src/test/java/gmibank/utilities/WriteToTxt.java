package gmibank.utilities;

import gmibank.pojos.Customer;
import gmibank.pojos.*;

import javax.naming.event.ObjectChangeListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class WriteToTxt {

    public static void saveDataInFile(String fileName, Customer9[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0;i<customers.length;i++)

                writer.append(customers[i].getSsn()+",\n");

            writer.close();
        } catch(Exception e){

        }
    }
    public static void saveDataInFileWithSSN(String fileName, Customer9 customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.append(customers.getSsn());

            writer.close();
        } catch(Exception e){

        }
    }


    public static void saveDataInFileWithUserInfo(String fileName, Customer9 customer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.append(customer.getFirstName());

            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveDataInFileWithAllCustomerInfo(String fileName, Customer9[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));


            for (int i =0; i<customers.length;i++){

                writer.append(customers[i].getFirstName()+" , "+customers[i].getLastName()+","+customers[i].getCity()+" , "+customers[i].getAddress());
                if(customers[i].getUser() != null)
                    writer.append(customers[i].getFirstName());
                if(customers[i].getCountry() != null)
                    writer.append(customers[i].getCountry().getName()+"\n");

            }

            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveAllStates(String fileName, List<Map<String,Object>> json) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < json.size(); i++)
                writer.append(json.get(i).get("name") + "\n");

            writer.close();
        } catch (Exception e) {
        }}



    public static void saveAllStates2(String fileName, States[] states)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i=0; i<states.length; i++)
                writer.append(states[i].getName()+" , "+states[i].getId()+"\n");

            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveAllSSN(String fileName, List<Map<String, Object>> data)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i =0; i<data.size();i++)

                writer.append(data.get(i).get("lastName") + "\n");
            // writer.append(data.get(i).get("firstName") + ", " + data.get(i).get("lastName") + "\n");
            writer.close();
        } catch(Exception e){
        }
    }

    public static void saveAllCustomerDateBase(String fileName, List<Object> allCustomer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < allCustomer.size(); i++) {
                writer.append(allCustomer.get(i) + "\n");
            }
            writer.close();
        } catch (Exception e) {
        }
    }
}
