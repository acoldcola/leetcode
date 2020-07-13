package leetcode;

/**
 * @Author ZhangKe
 * @Date 2020/7/11 22:35
 * @Version 1.0
 */
public class leetcode5177 {
    public String reformatDate(String date) {
        String[] str = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(str[2]);
        switch (str[1]) {
            case "Jan":
                sb.append("-01");
                break;
            case "Feb":
                sb.append("-02");
                break;
            case "Mar":
                sb.append("-03");
                break;
            case "Apr":
                sb.append("-04");
                break;
            case "May":
                sb.append("-05");
                break;
            case "Jun":
                sb.append("-06");
                break;
            case "Jul":
                sb.append("-07");
                break;
            case "Aug":
                sb.append("-08");
                break;
            case "Sep":
                sb.append("-09");
                break;
            case "Oct":
                sb.append("-10");
                break;
            case "Nov":
                sb.append("-11");
                break;
            case "Dec":
                sb.append("-12");
                break;
        }
          if (str[0].length() == 3) {
              sb.append("-" + str[0].substring(0, 1));
          }else {
              sb.append("-" + str[0].substring(0, 1));
          }
          return sb.toString();
    }
}
