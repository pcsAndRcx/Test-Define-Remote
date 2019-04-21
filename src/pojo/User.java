package pojo;

public class User {
    private String yhdm;
    private String jsdm;

    public String getYhdm() {
        return yhdm;
    }

    public void setYhdm(String yhdm) {
        this.yhdm = yhdm;
    }

    public String getJsdm() {
        return jsdm;
    }

    public void setJsdm(String jsdm) {
        this.jsdm = jsdm;
    }

    @Override
    public String toString() {
        return "User{" +
                "yhdm='" + yhdm + '\'' +
                ", jsdm='" + jsdm + '\'' +
                '}';
    }

public User(String yhdm, String jsdm) {
    this.yhdm = yhdm;
    this.jsdm = jsdm;
}
}
