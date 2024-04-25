public class WeatherComparison {
    private Double[][] weatherTemps;
    public static void main(String[] args) {
        Double[][] weatherTemps = {
            {62.59, 53.88, 34.85, 43.13, 44.13, 40.38, 39.71},
            {36.92, 32.1, 43.75, 33.54, 33.74, 38.13, 37.13},
            {51.8, 49.9, 48.8, 52.8, 47.0, 45.5, 47.5},
            {21.6, 28.3, 27.6, 21.1, 28.6, 19.0, 22.1},
            {37.4, 39.1, 40.5, 38.3, 42.0, 48.2, 55.7},
            {45.4, 53.0, 29.6, 31.8, 43.2, 50.7, 54.9},
        };
        WeatherComparison comparison = new WeatherComparison(weatherTemps);
        comparison.averageWeather();
        comparison.averageWeeklyWeather();
        comparison.averageDailyWeather();
    }

    public WeatherComparison(Double[][] weatherTemps) {
        this.weatherTemps = weatherTemps;
    }

    public void averageWeather() {
        int count = 0;
        double sum = 0;
        for (int row = 0; row < weatherTemps.length; row++) {
            for (int column = 0; column < weatherTemps[row].length; column++) {
                sum += weatherTemps[row][column];
                count++;
            }
        }
        System.out.println("The average temperature over the 6 year span is " + (sum / count) + " degrees.");
    }

    public void averageWeeklyWeather() {
        for (int week = 0; week < weatherTemps.length; week++) {
            double weekSum = 0;
            for (int day = 0; day < weatherTemps[week].length; day++) {
                weekSum += weatherTemps[week][day];
            }
            double weekAverage = weekSum / weatherTemps[week].length;
            System.out.println("The average temp for week " + (week + 1) + " was " + weekAverage);
        }
    }

    public void averageDailyWeather() {
        for (int day = 0; day < weatherTemps[0].length; day++) {
            double dailySum = 0;
            for (int week = 0; week < weatherTemps.length; week++) {
                dailySum += weatherTemps[week][day];
            }
            double dailyAverage = dailySum / weatherTemps.length;
            System.out.println("The average for April " + (day + 1) + " was " + dailyAverage);
        }
    }
}
