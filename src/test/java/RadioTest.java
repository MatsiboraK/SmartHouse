import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSwitchToTheFirstRadioStation() {
        int amountStations = 50;
        Radio radio = new Radio(amountStations);

        radio.setCurrentRadioStation(amountStations - 1);
        radio.nextRadioStation();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToTheLastRadioStation() {
        int amountStations = 50;
        Radio radio = new Radio(amountStations);

        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        Assertions.assertEquals(amountStations - 1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStation() {
        radio.setCurrentRadioStation(1);

        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetRadioStationAboveMax() {
        radio.setCurrentRadioStation(10);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNotSetRadioStationBeforeMin() {

        radio.setCurrentRadioStation(-1);

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchOnLastRadioStation() {
        radio.setCurrentRadioStation(8);
        radio.nextRadioStation();

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchNextRadioStationLimitValues() {
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();

        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchNextRadioStation() {
        radio.setCurrentRadioStation(1);
        radio.nextRadioStation();

        Assertions.assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevRadioStation() {
        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();

        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void shouldNotSwitchPrevRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        Assertions.assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevRadioStationLimitValues() {
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();

        Assertions.assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchPrevRadioStationCheckLimitValues() {
        radio.setCurrentRadioStation(8);
        radio.prevRadioStation();

        Assertions.assertEquals(7, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetCurrentVolume() {
        radio.setCurrentVolume(99);

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetZeroVolume() {
        radio.setCurrentVolume(0);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeLimitValuesCheck() {
        radio.setCurrentVolume(100);

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        radio.setCurrentVolume(101);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeBeforeMin() {
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeCheckLimitValues() {
        radio.setCurrentVolume(1);

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchIncreaseVolume() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchIncreaseVolumeLimitValuesCheck() {
        radio.setCurrentVolume(1);
        radio.increaseVolume();

        Assertions.assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchIncreaseCheckVolumeLimitValues() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSwitchIncreaseVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchReduceVolume() {
        radio.setCurrentVolume(1);
        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchReduceVolumeLimitValuesCheck() {
        radio.setCurrentVolume(100);
        radio.reduceVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldSwitchReduceVolumeCheckLimitValues() {
        radio.setCurrentVolume(99);
        radio.reduceVolume();

        Assertions.assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSwitchReduceVolume() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

}
