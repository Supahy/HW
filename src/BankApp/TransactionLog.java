package BankApp;

import java.time.LocalDateTime;
import java.util.*;

public class TransactionLog {
    LocalDateTime dateTime;
    String type;
    String massage;

    public TransactionLog(LocalDateTime dateTime, String type, String massage) {
        this.dateTime = dateTime;
        this.type = type;
        this.massage = massage;
    }

    public static TreeMap<LocalDateTime, TransactionLog> logs = new TreeMap<>();

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        TransactionLog that = (TransactionLog) o;
        return Objects.equals(dateTime, that.dateTime) &&
                Objects.equals(type, that.type) &&
                Objects.equals(massage, that.massage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, type, massage);
    }

    @Override
    public String toString() {
        return "LOG {" + "dateTime= " + dateTime + ", type='" + type + '\'' + ", massage='" + massage + '\'' + '}' + "\n";
    }
}
