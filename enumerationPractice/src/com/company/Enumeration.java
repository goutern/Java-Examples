package com.company;

interface Enumeration
{
    //return true if another element in collection exists
    public boolean hasNext();
    // return the next element in the collection as an Object
    public Object getNext();
}
// NameCollection implements a collection of names
// using a simple array
class NameCollection
{
    String[] names;
    NameCollection(String[] names)
    {
        this.names = names;
    }
    // getEnumeration() should return an instance of a class
    // that implements the Enumeration interface where
    // hasNext() and getNext() correspond to the data
    // stored within the names array
    Enumeration getEnumeration()
    {
        // Complete code here using an inner class
        return new enumeration<>();

    }
    public class enumeration<T> implements Enumeration{
        int i = -1;
        @Override
        public boolean hasNext() {
            if(names.length > i + 1 ){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Object getNext() {
            if(hasNext()){
                i++;
                return names[i];
            }
            return null;
        }
    }
}
