package org.example;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends BaseHero> implements Iterable<T> {

    List<T> dreamTeam = new ArrayList<T>();

    public void add(T t) {
        dreamTeam.add(t);
    }


    @Override
    public Iterator<T> iterator() {
        return dreamTeam.iterator();
    }

    public T minArmor() {
        T element = null;
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext() && element == null) {
            T currentElement = iterator.next();
            if (currentElement instanceof Shield) {
                element = currentElement;

            }
        }

        while (iterator.hasNext()) {
            T currentElement = iterator.next();
            if (currentElement instanceof Shield) {
                if (((Shield) currentElement).recover() < ((Shield) element).recover()) {
                    element = currentElement;
                }
            }
        }
                return element;
            }

            public int maxTeamRange () {
                int maxRange = 0;
                for (T item : dreamTeam) {
                    if (item instanceof Archer) {
                        if (((Archer) item).range() > maxRange) maxRange = ((Archer) item).range();
                    }
                }
                return maxRange;

    }
}

