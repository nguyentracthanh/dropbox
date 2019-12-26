package vn.edu.usth.dropbox.database;

import io.realm.Realm;
import io.realm.RealmResults;
import vn.edu.usth.dropbox.model.response.UserInfo;

public class RealmContext {
    private Realm realm;
    private static RealmContext instance;

    private RealmContext() {
        realm = Realm.getDefaultInstance();
    }

    public static RealmContext getInstance() {
        if (instance == null) {
            instance = new RealmContext();
        }
        return instance;
    }

    public void addUser(UserInfo user) {
        if (user == null) return;

        realm.beginTransaction();
        realm.copyToRealmOrUpdate(user);
        realm.commitTransaction();
    }

    public UserInfo getUser() {
        return realm.where(UserInfo.class).findFirst();
    }

    public void deleteUser() {
        RealmResults<UserInfo> user = realm.where(UserInfo.class).findAll();
        realm.beginTransaction();
        user.deleteAllFromRealm();
        realm.commitTransaction();
    }

    public void updateAvatar(String url) {
        realm.executeTransaction((realm) -> {
            UserInfo user = getUser();
            if (user != null) {
                user.setAvatar(url);
            }
        });
    }
}
