object TemperatureConverter {
  def calculateAverage(temperaturesCelsius: List[Double]): Double = {
 
    val temperaturesFahrenheit = temperaturesCelsius.map(c => (c * 9/5) + 32)
    

    val sumFahrenheitOption = temperaturesFahrenheit.reduceOption(_ + _)
    

    sumFahrenheitOption match {
      case Some(sumFahrenheit) => sumFahrenheit / temperaturesCelsius.length 
      case None => 0.0 
    }
  }

  def main(args: Array[String]): Unit = {
    val temperaturesCelsius = List(0.0, 10.0, 20.0, 30.0)
    val averageFahrenheit = calculateAverage(temperaturesCelsius)
    println(s"Average Fahrenheit Temperature: $averageFahrenheit")
  }
}
