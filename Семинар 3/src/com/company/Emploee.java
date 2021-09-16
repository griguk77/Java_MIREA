package com.company;

public final class Emploee extends AbstractPerson {
    final String department = "Номер 1";
    //final Enum position{

    //}

    Emploee(String name) {
        super(name);
    }

    public String think() {
        return "Пролетарии всех стран, объединяйтесь";
    }

    public String getName(){
        return this.name;
    }
}