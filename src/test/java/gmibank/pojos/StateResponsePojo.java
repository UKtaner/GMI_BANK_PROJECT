package gmibank.pojos;

public class StateResponsePojo {
     private Integer id;
     private States statePojo;

     public Integer getId() {
          return id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public States getStatePojo() {
          return statePojo;
     }

     public void setStatePojo(States statePojo) {
          this.statePojo = statePojo;
     }

     @Override
     public String toString() {
          return "StateResponsePojo{" +
                  "id=" + id +
                  ", statePojo=" + statePojo +
                  '}';
     }
}
