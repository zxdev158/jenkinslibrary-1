class Dog {

    def name;

    Dog() {

    }

    Dog(name) {
        this.name = name
        println("name = " + name)
    }

    def getName() {
        return name
    }

    void setName(name) {
        this.name = name
    }

    def run() {
        println(name + " is running ...")
        setName("小小鸟")
    }

    static void main(String[] args) {

        Dog d = new Dog()
        d.setName("dahuang")
        println(d.getName())
        d.run()
        println(d.getName())
    }
}
