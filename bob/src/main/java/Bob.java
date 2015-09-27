public class Bob {

    public String hey(String msg) {
        msg = msg.trim();
        if (msg.isEmpty()) {
            return "Fine. Be that way!";
        }
        if (msg.equals(msg.toUpperCase()) && (!msg.equals(msg.toLowerCase()))) {
            return "Whoa, chill out!";
        }
        if (msg.endsWith("?")) {
            return "Sure.";
        }
        return "Whatever.";
    }
}
