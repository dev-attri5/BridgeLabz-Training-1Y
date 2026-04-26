import java.util.Arrays;
import java.util.List;

public class Problem01SmartHomeLightingAutomation {
    @FunctionalInterface
    interface LightBehavior {
        void activate(String trigger);
    }

    public static void main(String[] args) {
        LightBehavior motionMode = trigger ->
            System.out.println(trigger + ": hallway lights turn on at 80% brightness for 2 minutes.");
        LightBehavior eveningMode = trigger ->
            System.out.println(trigger + ": living room lights switch to warm 40% brightness.");
        LightBehavior voiceMode = trigger ->
            System.out.println(trigger + ": party lights start a rotating color pattern.");

        List<String> triggers = Arrays.asList("Motion Sensor", "6:30 PM Schedule", "Voice Command: movie mode");
        List<LightBehavior> behaviors = Arrays.asList(motionMode, eveningMode, voiceMode);

        for (int index = 0; index < triggers.size(); index++) {
            behaviors.get(index).activate(triggers.get(index));
        }
    }
}
