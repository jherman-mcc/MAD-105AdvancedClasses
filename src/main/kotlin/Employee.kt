// Define class with name, number and shift
open class employee (name: String,
                position: String,
                salary: Boolean,
                payRate: Double,
                shift: Int = 1,
                pay: Long,
                hoursin: Double)
{
    // define the fullInfo including name
    var fullInfo = "$name $position $payRate $pay"

    // define getter and setter for name; update fullInfo
    var name: String = name
        get() = field
        set(value) {
            field = value
            fullInfo = "$name $position $payRate $pay"
        }

    // define getter and setter for position; update fullInfo
    var position: String = position
        get() = field
        set(value) {
            field = value
            fullInfo = "$name $position $payRate $pay"
        }
    // define getter and setter for position; update fullInfo
    var salary: Boolean = salary
        get() = field
        set(value) {
            field = value
        }

    // define getter and setter for payRate; update fullInfo
    var payRate: Double = payRate
        get() = field
        set(value) {
            field = value
            fullInfo = "$name $position $payRate $pay"
        }

    // define getter and setter for pay; update fullInfo
    var pay: Long = pay
        get() = field
        set(value) {
            field = value
            fullInfo = "$name $position $payRate $pay"
        }

    // define getter and setter for shift; update fullInfo
    var shift: Int = shift
        get() = field
        set(value) {
            field = value
        }

    // define getter and setter for shift; update fullInfo
    var hoursin: Double = hoursin
        get() = field
        set(value) {
            field = value
        }
}

    fun calculate(hoursin: Double)
    {
        if (employee.shift == 2)
             employee.payRate = employee.payRate + (employee.payRate * 0.05)
        else if (employee.shift == 3)
        employee.payRate = employee.payRate + (employee.payRate * 0.10)
        if (hoursin > 40) and (employee.Salary == 0)
        employee.payRate = (employee.payRate) + (employee.payRate * 1.5)
    }

    fun payWeek(hoursin): Double  {
        employee.pay = hoursin * employee.payRate
        return
    }

    // define printAll by printing fullInfo
    fun printAll() {
        println(fullInfo)
    }

