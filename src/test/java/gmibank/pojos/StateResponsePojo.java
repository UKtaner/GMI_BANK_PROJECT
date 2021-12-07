package gmibank.pojos;

public class StateResponsePojo {
     private Integer id;
     private StatePojo statePojo;

     public Integer getId() {
          return id;
     }

     public void setId(Integer id) {
          this.id = id;
     }

     public StatePojo getStatePojo() {
          return statePojo;
     }

     public void setStatePojo(StatePojo statePojo) {
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
