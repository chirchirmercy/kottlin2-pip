fun main(){
    var properties=Person("mercy",10,20)
    properties.introduce()

    var word=Student("faith",100,30,7)
    word.study()

    var me=Car("vol","mercedes","blue",50)
    me.carry(10)
    me.identity()
    println(me.calculateParkingFee(30))

// var word=student("faith"10,20,)
}

//Create a class called Person that has the properties name, age, and gender.
//Create a constructor that sets these properties, and a method called introduce that
//prints out a message introducing the person.


open class Person(var name:String,var age:Int,var gender:Int) {
    fun introduce() {
        println("my name is $name ,i am $age years old and i am $gender ")
    }

}

//Create a class called Student that inherits from the Person class.
//Add a property called grade and a method called study that
//prints out a message indicating that the student is studying.
class Student( name:String, age:Int, gender:Int,val grade:Int):Person(name,age,gender){
    fun study(){
        println("Hi my name is $name, i am studying kotlin and I am in grade $grade")
    }

}
//1. Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity

//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy”
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20


open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        if(people<=capacity){
            println("carry $people passengers")
        }else{
            var x = people-capacity
            println("over capacity by $x people")
        }
    }
    fun identity(){
        println("i am a  $color  $make $model ")
    }
    open fun calculateParkingFee(hours:Int):Int{
        var fees=hours*20
        return fees
    }
}