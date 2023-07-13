package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    private List<String> serialNoMust;

    private Set<String> snCheckedList;

    private List<String> packageList;

    private List<String> list;

    private int num;

    private String res;

    public void input(String str){
        // 如果在必须添加中
        if (serialNoMust.contains(str)){
            snCheckedList.add(str);
        }else {
            if (res.equals("异常")){
                System.out.println("error");
            }

            if (list.size() > 0){
                list.remove(0);
                list.add(str);
                snCheckedList.add(str);
            }

        }
    }

    public static int calculate(int exd_x,  int n) {
        int num = exd_x / 2;
        for (int i = 0; i < n; i++) {
            num = (num + exd_x) / 2;
        }
        return num;
    }

    public static String matchingProvince(String province){
        Map<String, String> regexMap = new HashMap<>();
        regexMap.put("regex1", "北京|天津|上海|重庆");
        regexMap.put("regex2", "黑龙江|内蒙古");
        regexMap.put("regex3", "广西壮族自治区|西藏自治区|宁夏回族自治区|新疆维吾尔自治区|香港特别行政区|澳门特别行政区");
        regexMap.put("regex4", "河北|山西|辽宁|吉林|江苏|浙江|安徽|福建|江西|山东|河南|湖北|湖南|广东|海南|四川|贵州|云南|陕西|甘肃|青海|台湾");
        String find_province = "";
        for (Map.Entry<String, String> entry : regexMap.entrySet()) {
            String regexName = entry.getKey();
            String regex = entry.getValue();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(province);

            if (matcher.find()) {
                find_province = matcher.group(0);
                switch (regexName) {
                    case "regex1" -> {
                        return find_province + "市";
                    }
                    case "regex2" -> {
                        return find_province;
                    }
                    case "regex3" -> {
                        return find_province.substring(0, 2);
                    }
                    default -> {
                        return find_province + "省";
                    }
                }
            }
        }
        return find_province;
    }

    public static String matchingAddress(String address){
        String regex = "^(?:北京市|天津市|上海市|重庆市|河北省|山西省|辽宁省|吉林省|黑龙江省|江苏省|浙江省|安徽省|福建省|江西省|山东省|河南省|湖北省|湖南省|广东省|海南省|四川省|贵州省|云南省|陕西省|甘肃省|青海省|(?:内蒙古自治区|广西壮族自治区|西藏自治区|宁夏回族自治区|新疆维吾尔自治区|香港特别行政区|澳门特别行政区)|台湾省)?(?:市|自治州|地区)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);
        if (matcher.find()) {
            String matchedText = matcher.group();
            address = matchingAddress(address.replaceFirst(matchedText, ""));
        }
        return address;
    }


    public static void main(String[] args) {
//        String str = "浙江省-杭州市余杭区某某物流公司";
//        System.out.println(str.length());
//
//        System.out.println(calculate(100, 2));
//        String aa = matchingProvince("浙省禁用");
//        System.out.println(aa);
//
//        System.out.println("" + null);
//
//        System.out.println(matchingAddress("湖北省武汉市洪山区肖婷丹-慕思经典"));
        Boolean freeze_flag = false;
        System.out.println(String.format(" and %s %s%s ",
                freeze_flag?"":"NOT",
                "EXISTS(select wri.ID from WMS_REQUISITION_ITEM wri left join WMS_REQ_ITEM_EXTRA wrie on wri.ID = wrie.ITEM_ID ",
                "WHERE WRI.IS_ACTIVE = 1 AND wrie.IS_ACTIVE = 1 AND wrie.FREEZE_FLAG = 1 AND wri.FORM_NO = o.FORM_NO)"));
    }
}
