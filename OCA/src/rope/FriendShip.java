package rope;

import java.io.FileNotFoundException;
import java.util.*;

 public class FriendShip {
    // This is for you to implement
    //
    // This method takes 2 String parameters and
    // makes them "friends" of each other.
    //
    // Note: The order of names does not matter
    // Note: Do not forget to write tests to have good test coverage for this
    // method

    private Map<String,Set<String>> friendsMap;

    public FriendShip(){
        friendsMap = new HashMap<>();
    }

    public void makeFriend(String nameKey, String friendName) {

        validateInputs(nameKey, friendName);
        nameKey = nameKey.toLowerCase();
        friendName = friendName.toLowerCase();

        //Adding 2nd friend to 1st friend.
        if(friendsMap.containsKey(nameKey)){
            friendsMap.get(nameKey).add(friendName);
        }else{
            Set<String>friendsSet = new HashSet<>();
            friendsSet.add(friendName);
            friendsMap.put(nameKey,friendsSet);
        }

        //Adding 1st friend to 2nd friend.
        if(friendsMap.containsKey(friendName)){
            friendsMap.get(friendName).add(nameKey);
        }else{
            Set<String>friendsSet = new HashSet<>();
            friendsSet.add(nameKey);
            friendsMap.put(friendName,friendsSet);
        }
    }


    // This is for you to implement
    //
    // This method takes 2 String parameters and
    // makes them no longer friends of each other.
    //
    // Note: The order of names does not matter
    // Note: Do not forget to write tests to have good test coverage for this
    // method
    public void unmakeFriend(String nameKey, String friendName) {

        validateInputs(nameKey, friendName);

        nameKey = nameKey.toLowerCase();
        friendName = friendName.toLowerCase();

        if(friendsMap.containsKey(nameKey)){
            friendsMap.get(nameKey).remove(friendName);
        }

        if(friendsMap.containsKey(friendName)){
            friendsMap.get(friendName).remove(nameKey);
        }

    }


    // This is for you to implement
    //
    // This method takes a single argument (name) and
    // returns all immediate "friends" of that name
    //
    // For example, A & B are friends, B & C are friends, and C & D are friends.
    // getDirectFriends(B) would return A and C
    // getDirectFriends(D) would return C
    //
    // Note: It should not return duplicate names
    // Note: Do not forget to write tests to have good test coverage for this
    // method
    public List<String> getDirectFriends(String nameKey) {
        validateInput(nameKey);

        nameKey = nameKey.toLowerCase();
        if(friendsMap.containsKey(nameKey)){
            return new ArrayList<>(friendsMap.get(nameKey));
        }
        return null;
    }


    // This is for you to implement (Seniors and above)
    //
    // This method takes a single argument (name) and
    // returns all the indirect "friends" of that name
    //
    // For example, A & B are friends, B & C are friends, and C & D are friends.
    // getInirectFriends(A) would return C and D
    //
    // Note: It should not return duplicate names
    // Note: Do not forget to write tests to have good test coverage for this
    // method

    public List<String> getIndirectFriends(String nameKey) {
        validateInput(nameKey);
        nameKey = nameKey.toLowerCase();
        if(friendsMap.containsKey(nameKey)){
            Set<String> indirectFriends = new HashSet<>();
            for(String friend: friendsMap.get(nameKey)){
                indirectFriends.addAll(friendsMap.get(friend));
                for(String friendsFriends: friendsMap.get(friend))
                indirectFriends.addAll(friendsMap.get(friendsFriends));
            }

            for (String friend: friendsMap.get(nameKey)) {
                indirectFriends.remove(friend);
            }

            List<String> arList = new ArrayList<>(indirectFriends);
            arList.remove(nameKey);
            return arList;
        }
        return null;
    }

    private void validateInput(String namekey){
        if(namekey == null || namekey.length() == 0){
            throw new IllegalArgumentException("nameKey can neither be null nor be empty");
        }
    }

    private void validateInputs(String nameKey, String friendName){

            if (nameKey == null || friendName == null || nameKey.equals(friendName) ||
                    nameKey.length() == 0 || friendName.length() == 0) {
                throw new IllegalArgumentException("Friends name can neither be null nor be empty");
            }


    }


    public static void main(String[] args) {
       /* FriendShip friendShip = new FriendShip();
        friendShip.makeFriend("A","B");
        friendShip.makeFriend("B","C");
        friendShip.makeFriend("C","D");
        System.out.println(friendShip.friendsMap);
        System.out.println("Direct friends: "+ friendShip.getDirectFriends("A"));
        System.out.println("Indirect Friends: "+ friendShip.getIndirectFriends("A"));*/
        FriendShip friendship = new FriendShip();
        friendship.makeFriend("A","B");
        friendship.makeFriend("A","C");
        friendship.unmakeFriend("A","B");
        System.out.println("Indirect Friends: "+ friendship.getDirectFriends("A"));
    }
}
