package by.lesson.practics.class9;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Ferma implements Externalizable {
    private String name;
    private int animalsCount;
    private String city;

    public Ferma() {
    }

    public Ferma(String name, int animalsCount, String city) {
        this.name = name;
        this.animalsCount = animalsCount;
        this.city = city;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(animalsCount);
        out.writeUTF(city);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        animalsCount = in.readInt();
        city = in.readUTF();
    }

    @Override
    public String toString() {
        return "Ferma{name='" + name + "', animalsCount=" + animalsCount + ", city='" + city + "'}";
    }
}