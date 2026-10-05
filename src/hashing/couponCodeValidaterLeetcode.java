package hashing;
import java.util.*;

public class couponCodeValidaterLeetcode {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        // valid business lines
        HashSet<String> validSet = new HashSet<>();
        Collections.addAll(validSet, "electronics", "grocery", "pharmacy", "restaurant");

        // business line priority
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);

        // temp list -> [businessLine, code]
        List<String[]> tempList = new ArrayList<>();

        for (int i = 0; i < code.length; i++) {

            // base filtering
            if (!isActive[i] || code[i].isEmpty()) continue;

            if (isAlphanumeric(code[i]) && validSet.contains(businessLine[i])) {
                tempList.add(new String[]{businessLine[i], code[i]});
            }
        }

        // sorting
        Collections.sort(tempList, (a, b) -> {
            if (!a[0].equals(b[0])) {
                return priority.get(a[0]) - priority.get(b[0]);
            } else {
                return a[1].compareTo(b[1]);
            }
        });

        // extract codes
        List<String> ans = new ArrayList<>();
        for (String[] item : tempList) {
            ans.add(item[1]);
        }

        return ans;
    }

    boolean isAlphanumeric(String str) {
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch) || ch == '_') continue;
            return false;
        }
        return true;
    }

}
