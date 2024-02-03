import Sem_2.*;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {
    Car car = new Car("Chery", "Tiggo", 2023);
    Motorcycle moto = new Motorcycle("YAMAHA", "Best", 2021);

    //- проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void carIsInstanceOfVehicle() {
        assertThat(car instanceof Vehicle);
    }

    //- проверка того, объект Car создается с 4-мя колесами
    @Test
    void carWithFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // - проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void motorcycleWithTwoWheels() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    //- проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void carTestDrive() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void motorcycleTestDrive() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void speedCarAfterPark() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void speedMotorcycleAfterPark() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}