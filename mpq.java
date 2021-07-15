Main.java:4: error: Main.Car is not abstract and does not override abstract method compareTo(Main.Car) in Comparable
    public class Car implements Comparable<Car>{
           ^
Main.java:27: error: cannot find symbol
            if (c.compareTo(p) < 0) {
                 ^
  symbol:   method compareTo(T)
  location: variable c of type T
  where T is a type-variable:
    T extends Object declared in class Main.Mypriorityqueue
Main.java:55: error: cannot find symbol
                downheapyfy(pi);
                ^
  symbol:   method downheapyfy(int)
  location: class Main.Mypriorityqueue<T>
  where T is a type-variable:
    T extends Object declared in class Main.Mypriorityqueue
Main.java:60: error: non-static type variable T cannot be referenced from a static context
            T temp = data.get(ci);
            ^
Main.java:60: error: non-static variable data cannot be referenced from a static context
            T temp = data.get(ci);
                     ^
Main.java:61: error: non-static variable data cannot be referenced from a static context
            data.set(ci,data,get(pi));
                        ^
Main.java:61: error: non-static variable data cannot be referenced from a static context
            data.set(ci,data,get(pi));
            ^
Main.java:61: error: cannot find symbol
            data.set(ci,data,get(pi));
                             ^
  symbol:   method get(int)
  location: class Main.Mypriorityqueue<T>
  where T is a type-variable:
    T extends Object declared in class Main.Mypriorityqueue
Main.java:62: error: non-static variable data cannot be referenced from a static context
            data.set(pi,temp);
            ^
Main.java:59: error: Illegal static declaration in inner class Main.Mypriorityqueue
        public static void swap(int ci, int pi){
                           ^
  modifier 'static' is only allowed in constant variable declarations
Main.java:72: error: incompatible types: int cannot be converted to T
                return -1;
                       ^
  where T is a type-variable:
    T extends Object declared in class Main.Mypriorityqueue
Main.java:74: error: cannot find symbol
            Swap(data.size() -1,0);
            ^
  symbol:   method Swap(int,int)
  location: class Main.Mypriorityqueue<T>
  where T is a type-variable:
    T extends Object declared in class Main.Mypriorityqueue
Main.java:76: error: cannot find symbol
            downheapyfy(0);
            ^
  symbol:   method downheapyfy(int)
  location: class Main.Mypriorityqueue<T>
  where T is a type-variable:
    T extends Object declared in class Main.Mypriorityqueue
Main.java:82: error: incompatible types: int cannot be converted to T
                return -1;
                       ^
  where T is a type-variable:
    T extends Object declared in class Main.Mypriorityqueue
Main.java:91: error: non-static variable this cannot be referenced from a static context
        Mypriorityqueue<Car> pq = new Mypriorityqueue<>();
                                  ^
Main.java:92: error: non-static variable this cannot be referenced from a static context
        Car c1 = new Car(200,10,"audi","black");
                 ^
Main.java:93: error: non-static variable this cannot be referenced from a static context
        Car c2 = new Car(100,15,"MS","grey");
                 ^
Main.java:94: error: non-static variable this cannot be referenced from a static context
        Car c3 = new Car(80,20,"Hyundai","white");
                 ^
Main.java:95: error: non-static variable this cannot be referenced from a static context
        Car c4 = new Car(300,5,"BMW","red");
                 ^
19 errors