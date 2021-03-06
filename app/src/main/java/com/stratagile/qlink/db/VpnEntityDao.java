package com.stratagile.qlink.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "VPN_ENTITY".
*/
public class VpnEntityDao extends AbstractDao<VpnEntity, Long> {

    public static final String TABLENAME = "VPN_ENTITY";

    /**
     * Properties of entity VpnEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Country = new Property(1, String.class, "country", false, "COUNTRY");
        public final static Property IsMainNet = new Property(2, boolean.class, "isMainNet", false, "IS_MAIN_NET");
        public final static Property OwnerP2pId = new Property(3, String.class, "ownerP2pId", false, "OWNER_P2P_ID");
        public final static Property Hash = new Property(4, String.class, "hash", false, "HASH");
        public final static Property UserId = new Property(5, String.class, "userId", false, "USER_ID");
        public final static Property ProfileLocalPath = new Property(6, String.class, "profileLocalPath", false, "PROFILE_LOCAL_PATH");
        public final static Property Password = new Property(7, String.class, "password", false, "PASSWORD");
        public final static Property PrivateKeyPassword = new Property(8, String.class, "privateKeyPassword", false, "PRIVATE_KEY_PASSWORD");
        public final static Property ProfileUUid = new Property(9, String.class, "profileUUid", false, "PROFILE_UUID");
        public final static Property IpV4Address = new Property(10, String.class, "ipV4Address", false, "IP_V4_ADDRESS");
        public final static Property Continent = new Property(11, String.class, "continent", false, "CONTINENT");
        public final static Property Username = new Property(12, String.class, "username", false, "USERNAME");
        public final static Property GroupNum = new Property(13, int.class, "groupNum", false, "GROUP_NUM");
        public final static Property Bandwidth = new Property(14, String.class, "bandwidth", false, "BANDWIDTH");
        public final static Property ConnectMaxnumber = new Property(15, int.class, "connectMaxnumber", false, "CONNECT_MAXNUMBER");
        public final static Property AssetTranfer = new Property(16, double.class, "assetTranfer", false, "ASSET_TRANFER");
        public final static Property Avatar = new Property(17, String.class, "avatar", false, "AVATAR");
        public final static Property RegisterQlc = new Property(18, double.class, "registerQlc", false, "REGISTER_QLC");
        public final static Property OnlineTime = new Property(19, int.class, "onlineTime", false, "ONLINE_TIME");
        public final static Property ConnsuccessNum = new Property(20, int.class, "connsuccessNum", false, "CONNSUCCESS_NUM");
        public final static Property IsInMainWallet = new Property(21, boolean.class, "isInMainWallet", false, "IS_IN_MAIN_WALLET");
        public final static Property UnReadMessageCount = new Property(22, int.class, "unReadMessageCount", false, "UN_READ_MESSAGE_COUNT");
        public final static Property FriendNum = new Property(23, String.class, "friendNum", false, "FRIEND_NUM");
        public final static Property Configuration = new Property(24, String.class, "configuration", false, "CONFIGURATION");
        public final static Property VpnName = new Property(25, String.class, "vpnName", false, "VPN_NAME");
        public final static Property P2pId = new Property(26, String.class, "p2pId", false, "P2P_ID");
        public final static Property P2pIdPc = new Property(27, String.class, "p2pIdPc", false, "P2P_ID_PC");
        public final static Property Address = new Property(28, String.class, "address", false, "ADDRESS");
        public final static Property Type = new Property(29, int.class, "type", false, "TYPE");
        public final static Property CurrentConnect = new Property(30, int.class, "currentConnect", false, "CURRENT_CONNECT");
        public final static Property Qlc = new Property(31, float.class, "qlc", false, "QLC");
        public final static Property IsConnected = new Property(32, boolean.class, "isConnected", false, "IS_CONNECTED");
        public final static Property LastFreeTime = new Property(33, long.class, "lastFreeTime", false, "LAST_FREE_TIME");
        public final static Property Online = new Property(34, boolean.class, "online", false, "ONLINE");
        public final static Property IsLoadingAvater = new Property(35, boolean.class, "isLoadingAvater", false, "IS_LOADING_AVATER");
        public final static Property AvaterUpdateTime = new Property(36, long.class, "avaterUpdateTime", false, "AVATER_UPDATE_TIME");
        public final static Property Price = new Property(37, float.class, "price", false, "PRICE");
    }


    public VpnEntityDao(DaoConfig config) {
        super(config);
    }
    
    public VpnEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VPN_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"COUNTRY\" TEXT," + // 1: country
                "\"IS_MAIN_NET\" INTEGER NOT NULL ," + // 2: isMainNet
                "\"OWNER_P2P_ID\" TEXT," + // 3: ownerP2pId
                "\"HASH\" TEXT," + // 4: hash
                "\"USER_ID\" TEXT," + // 5: userId
                "\"PROFILE_LOCAL_PATH\" TEXT," + // 6: profileLocalPath
                "\"PASSWORD\" TEXT," + // 7: password
                "\"PRIVATE_KEY_PASSWORD\" TEXT," + // 8: privateKeyPassword
                "\"PROFILE_UUID\" TEXT," + // 9: profileUUid
                "\"IP_V4_ADDRESS\" TEXT," + // 10: ipV4Address
                "\"CONTINENT\" TEXT," + // 11: continent
                "\"USERNAME\" TEXT," + // 12: username
                "\"GROUP_NUM\" INTEGER NOT NULL ," + // 13: groupNum
                "\"BANDWIDTH\" TEXT," + // 14: bandwidth
                "\"CONNECT_MAXNUMBER\" INTEGER NOT NULL ," + // 15: connectMaxnumber
                "\"ASSET_TRANFER\" REAL NOT NULL ," + // 16: assetTranfer
                "\"AVATAR\" TEXT," + // 17: avatar
                "\"REGISTER_QLC\" REAL NOT NULL ," + // 18: registerQlc
                "\"ONLINE_TIME\" INTEGER NOT NULL ," + // 19: onlineTime
                "\"CONNSUCCESS_NUM\" INTEGER NOT NULL ," + // 20: connsuccessNum
                "\"IS_IN_MAIN_WALLET\" INTEGER NOT NULL ," + // 21: isInMainWallet
                "\"UN_READ_MESSAGE_COUNT\" INTEGER NOT NULL ," + // 22: unReadMessageCount
                "\"FRIEND_NUM\" TEXT," + // 23: friendNum
                "\"CONFIGURATION\" TEXT," + // 24: configuration
                "\"VPN_NAME\" TEXT," + // 25: vpnName
                "\"P2P_ID\" TEXT," + // 26: p2pId
                "\"P2P_ID_PC\" TEXT," + // 27: p2pIdPc
                "\"ADDRESS\" TEXT," + // 28: address
                "\"TYPE\" INTEGER NOT NULL ," + // 29: type
                "\"CURRENT_CONNECT\" INTEGER NOT NULL ," + // 30: currentConnect
                "\"QLC\" REAL NOT NULL ," + // 31: qlc
                "\"IS_CONNECTED\" INTEGER NOT NULL ," + // 32: isConnected
                "\"LAST_FREE_TIME\" INTEGER NOT NULL ," + // 33: lastFreeTime
                "\"ONLINE\" INTEGER NOT NULL ," + // 34: online
                "\"IS_LOADING_AVATER\" INTEGER NOT NULL ," + // 35: isLoadingAvater
                "\"AVATER_UPDATE_TIME\" INTEGER NOT NULL ," + // 36: avaterUpdateTime
                "\"PRICE\" REAL NOT NULL );"); // 37: price
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VPN_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, VpnEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String country = entity.getCountry();
        if (country != null) {
            stmt.bindString(2, country);
        }
        stmt.bindLong(3, entity.getIsMainNet() ? 1L: 0L);
 
        String ownerP2pId = entity.getOwnerP2pId();
        if (ownerP2pId != null) {
            stmt.bindString(4, ownerP2pId);
        }
 
        String hash = entity.getHash();
        if (hash != null) {
            stmt.bindString(5, hash);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(6, userId);
        }
 
        String profileLocalPath = entity.getProfileLocalPath();
        if (profileLocalPath != null) {
            stmt.bindString(7, profileLocalPath);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(8, password);
        }
 
        String privateKeyPassword = entity.getPrivateKeyPassword();
        if (privateKeyPassword != null) {
            stmt.bindString(9, privateKeyPassword);
        }
 
        String profileUUid = entity.getProfileUUid();
        if (profileUUid != null) {
            stmt.bindString(10, profileUUid);
        }
 
        String ipV4Address = entity.getIpV4Address();
        if (ipV4Address != null) {
            stmt.bindString(11, ipV4Address);
        }
 
        String continent = entity.getContinent();
        if (continent != null) {
            stmt.bindString(12, continent);
        }
 
        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(13, username);
        }
        stmt.bindLong(14, entity.getGroupNum());
 
        String bandwidth = entity.getBandwidth();
        if (bandwidth != null) {
            stmt.bindString(15, bandwidth);
        }
        stmt.bindLong(16, entity.getConnectMaxnumber());
        stmt.bindDouble(17, entity.getAssetTranfer());
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(18, avatar);
        }
        stmt.bindDouble(19, entity.getRegisterQlc());
        stmt.bindLong(20, entity.getOnlineTime());
        stmt.bindLong(21, entity.getConnsuccessNum());
        stmt.bindLong(22, entity.getIsInMainWallet() ? 1L: 0L);
        stmt.bindLong(23, entity.getUnReadMessageCount());
 
        String friendNum = entity.getFriendNum();
        if (friendNum != null) {
            stmt.bindString(24, friendNum);
        }
 
        String configuration = entity.getConfiguration();
        if (configuration != null) {
            stmt.bindString(25, configuration);
        }
 
        String vpnName = entity.getVpnName();
        if (vpnName != null) {
            stmt.bindString(26, vpnName);
        }
 
        String p2pId = entity.getP2pId();
        if (p2pId != null) {
            stmt.bindString(27, p2pId);
        }
 
        String p2pIdPc = entity.getP2pIdPc();
        if (p2pIdPc != null) {
            stmt.bindString(28, p2pIdPc);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(29, address);
        }
        stmt.bindLong(30, entity.getType());
        stmt.bindLong(31, entity.getCurrentConnect());
        stmt.bindDouble(32, entity.getQlc());
        stmt.bindLong(33, entity.getIsConnected() ? 1L: 0L);
        stmt.bindLong(34, entity.getLastFreeTime());
        stmt.bindLong(35, entity.getOnline() ? 1L: 0L);
        stmt.bindLong(36, entity.getIsLoadingAvater() ? 1L: 0L);
        stmt.bindLong(37, entity.getAvaterUpdateTime());
        stmt.bindDouble(38, entity.getPrice());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, VpnEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String country = entity.getCountry();
        if (country != null) {
            stmt.bindString(2, country);
        }
        stmt.bindLong(3, entity.getIsMainNet() ? 1L: 0L);
 
        String ownerP2pId = entity.getOwnerP2pId();
        if (ownerP2pId != null) {
            stmt.bindString(4, ownerP2pId);
        }
 
        String hash = entity.getHash();
        if (hash != null) {
            stmt.bindString(5, hash);
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(6, userId);
        }
 
        String profileLocalPath = entity.getProfileLocalPath();
        if (profileLocalPath != null) {
            stmt.bindString(7, profileLocalPath);
        }
 
        String password = entity.getPassword();
        if (password != null) {
            stmt.bindString(8, password);
        }
 
        String privateKeyPassword = entity.getPrivateKeyPassword();
        if (privateKeyPassword != null) {
            stmt.bindString(9, privateKeyPassword);
        }
 
        String profileUUid = entity.getProfileUUid();
        if (profileUUid != null) {
            stmt.bindString(10, profileUUid);
        }
 
        String ipV4Address = entity.getIpV4Address();
        if (ipV4Address != null) {
            stmt.bindString(11, ipV4Address);
        }
 
        String continent = entity.getContinent();
        if (continent != null) {
            stmt.bindString(12, continent);
        }
 
        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(13, username);
        }
        stmt.bindLong(14, entity.getGroupNum());
 
        String bandwidth = entity.getBandwidth();
        if (bandwidth != null) {
            stmt.bindString(15, bandwidth);
        }
        stmt.bindLong(16, entity.getConnectMaxnumber());
        stmt.bindDouble(17, entity.getAssetTranfer());
 
        String avatar = entity.getAvatar();
        if (avatar != null) {
            stmt.bindString(18, avatar);
        }
        stmt.bindDouble(19, entity.getRegisterQlc());
        stmt.bindLong(20, entity.getOnlineTime());
        stmt.bindLong(21, entity.getConnsuccessNum());
        stmt.bindLong(22, entity.getIsInMainWallet() ? 1L: 0L);
        stmt.bindLong(23, entity.getUnReadMessageCount());
 
        String friendNum = entity.getFriendNum();
        if (friendNum != null) {
            stmt.bindString(24, friendNum);
        }
 
        String configuration = entity.getConfiguration();
        if (configuration != null) {
            stmt.bindString(25, configuration);
        }
 
        String vpnName = entity.getVpnName();
        if (vpnName != null) {
            stmt.bindString(26, vpnName);
        }
 
        String p2pId = entity.getP2pId();
        if (p2pId != null) {
            stmt.bindString(27, p2pId);
        }
 
        String p2pIdPc = entity.getP2pIdPc();
        if (p2pIdPc != null) {
            stmt.bindString(28, p2pIdPc);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(29, address);
        }
        stmt.bindLong(30, entity.getType());
        stmt.bindLong(31, entity.getCurrentConnect());
        stmt.bindDouble(32, entity.getQlc());
        stmt.bindLong(33, entity.getIsConnected() ? 1L: 0L);
        stmt.bindLong(34, entity.getLastFreeTime());
        stmt.bindLong(35, entity.getOnline() ? 1L: 0L);
        stmt.bindLong(36, entity.getIsLoadingAvater() ? 1L: 0L);
        stmt.bindLong(37, entity.getAvaterUpdateTime());
        stmt.bindDouble(38, entity.getPrice());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public VpnEntity readEntity(Cursor cursor, int offset) {
        VpnEntity entity = new VpnEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // country
            cursor.getShort(offset + 2) != 0, // isMainNet
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ownerP2pId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // hash
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // userId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // profileLocalPath
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // password
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // privateKeyPassword
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // profileUUid
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // ipV4Address
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // continent
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // username
            cursor.getInt(offset + 13), // groupNum
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // bandwidth
            cursor.getInt(offset + 15), // connectMaxnumber
            cursor.getDouble(offset + 16), // assetTranfer
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // avatar
            cursor.getDouble(offset + 18), // registerQlc
            cursor.getInt(offset + 19), // onlineTime
            cursor.getInt(offset + 20), // connsuccessNum
            cursor.getShort(offset + 21) != 0, // isInMainWallet
            cursor.getInt(offset + 22), // unReadMessageCount
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // friendNum
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // configuration
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // vpnName
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // p2pId
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // p2pIdPc
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // address
            cursor.getInt(offset + 29), // type
            cursor.getInt(offset + 30), // currentConnect
            cursor.getFloat(offset + 31), // qlc
            cursor.getShort(offset + 32) != 0, // isConnected
            cursor.getLong(offset + 33), // lastFreeTime
            cursor.getShort(offset + 34) != 0, // online
            cursor.getShort(offset + 35) != 0, // isLoadingAvater
            cursor.getLong(offset + 36), // avaterUpdateTime
            cursor.getFloat(offset + 37) // price
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, VpnEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCountry(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIsMainNet(cursor.getShort(offset + 2) != 0);
        entity.setOwnerP2pId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setHash(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUserId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setProfileLocalPath(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPassword(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPrivateKeyPassword(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setProfileUUid(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setIpV4Address(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setContinent(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setUsername(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setGroupNum(cursor.getInt(offset + 13));
        entity.setBandwidth(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setConnectMaxnumber(cursor.getInt(offset + 15));
        entity.setAssetTranfer(cursor.getDouble(offset + 16));
        entity.setAvatar(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setRegisterQlc(cursor.getDouble(offset + 18));
        entity.setOnlineTime(cursor.getInt(offset + 19));
        entity.setConnsuccessNum(cursor.getInt(offset + 20));
        entity.setIsInMainWallet(cursor.getShort(offset + 21) != 0);
        entity.setUnReadMessageCount(cursor.getInt(offset + 22));
        entity.setFriendNum(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setConfiguration(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setVpnName(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setP2pId(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setP2pIdPc(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setAddress(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setType(cursor.getInt(offset + 29));
        entity.setCurrentConnect(cursor.getInt(offset + 30));
        entity.setQlc(cursor.getFloat(offset + 31));
        entity.setIsConnected(cursor.getShort(offset + 32) != 0);
        entity.setLastFreeTime(cursor.getLong(offset + 33));
        entity.setOnline(cursor.getShort(offset + 34) != 0);
        entity.setIsLoadingAvater(cursor.getShort(offset + 35) != 0);
        entity.setAvaterUpdateTime(cursor.getLong(offset + 36));
        entity.setPrice(cursor.getFloat(offset + 37));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(VpnEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(VpnEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(VpnEntity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
