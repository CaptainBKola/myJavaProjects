package ChapterThree;

import java.util.Arrays;

public class PhoneBook {

    public static void main(String[] args) {


        String[] friends = new String[5];

        friends[0] = "Iman";
        friends[1] = "Andres";
        friends[2] = "Keith";
        friends[3] = "Sasha";
        friends[4] = "Tabitha";


        int[] friendsPhoneNumbers = new int[friends.length];
        friendsPhoneNumbers[0] = 5_558000;
        friendsPhoneNumbers[1] = 5554448;
        friendsPhoneNumbers[2] = 555_4311;
        friendsPhoneNumbers[3] = 555_7898;
        friendsPhoneNumbers[4] = 555_6710;

        for (int index = 0; index < friendsPhoneNumbers.length;index++){
            System.out.println(index);
        }
        System.out.println("this is the last index  "+ friendsPhoneNumbers[friendsPhoneNumbers.length-1]);

        String firstFriend = friends[2];
        System.out.println("First friend is " + firstFriend);
        System.out.println("Last friend is " + friends[friends.length - 1]);
        System.out.println(Arrays.stream(friendsPhoneNumbers).average());

    }

}
