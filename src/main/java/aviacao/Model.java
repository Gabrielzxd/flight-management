package aviacao;

import aviacao.Utils.Class;

import java.util.List;

public class Model {
    private String name;
    private List<SeatConfig> seatConfiguration;

    public Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
