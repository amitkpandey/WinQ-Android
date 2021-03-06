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
 * DAO for table "WALLET".
*/
public class WalletDao extends AbstractDao<Wallet, Long> {

    public static final String TABLENAME = "WALLET";

    /**
     * Properties of entity Wallet.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property I = new Property(1, Long.class, "i", false, "I");
        public final static Property PrivateKey = new Property(2, String.class, "privateKey", false, "PRIVATE_KEY");
        public final static Property PublicKey = new Property(3, String.class, "publicKey", false, "PUBLIC_KEY");
        public final static Property ScriptHash = new Property(4, String.class, "scriptHash", false, "SCRIPT_HASH");
        public final static Property Wif = new Property(5, String.class, "wif", false, "WIF");
        public final static Property Address = new Property(6, String.class, "address", false, "ADDRESS");
        public final static Property IsMain = new Property(7, boolean.class, "isMain", false, "IS_MAIN");
    }


    public WalletDao(DaoConfig config) {
        super(config);
    }
    
    public WalletDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WALLET\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"I\" INTEGER," + // 1: i
                "\"PRIVATE_KEY\" TEXT," + // 2: privateKey
                "\"PUBLIC_KEY\" TEXT," + // 3: publicKey
                "\"SCRIPT_HASH\" TEXT," + // 4: scriptHash
                "\"WIF\" TEXT," + // 5: wif
                "\"ADDRESS\" TEXT," + // 6: address
                "\"IS_MAIN\" INTEGER NOT NULL );"); // 7: isMain
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WALLET\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Wallet entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long i = entity.getI();
        if (i != null) {
            stmt.bindLong(2, i);
        }
 
        String privateKey = entity.getPrivateKey();
        if (privateKey != null) {
            stmt.bindString(3, privateKey);
        }
 
        String publicKey = entity.getPublicKey();
        if (publicKey != null) {
            stmt.bindString(4, publicKey);
        }
 
        String scriptHash = entity.getScriptHash();
        if (scriptHash != null) {
            stmt.bindString(5, scriptHash);
        }
 
        String wif = entity.getWif();
        if (wif != null) {
            stmt.bindString(6, wif);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(7, address);
        }
        stmt.bindLong(8, entity.getIsMain() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Wallet entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long i = entity.getI();
        if (i != null) {
            stmt.bindLong(2, i);
        }
 
        String privateKey = entity.getPrivateKey();
        if (privateKey != null) {
            stmt.bindString(3, privateKey);
        }
 
        String publicKey = entity.getPublicKey();
        if (publicKey != null) {
            stmt.bindString(4, publicKey);
        }
 
        String scriptHash = entity.getScriptHash();
        if (scriptHash != null) {
            stmt.bindString(5, scriptHash);
        }
 
        String wif = entity.getWif();
        if (wif != null) {
            stmt.bindString(6, wif);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(7, address);
        }
        stmt.bindLong(8, entity.getIsMain() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Wallet readEntity(Cursor cursor, int offset) {
        Wallet entity = new Wallet( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // i
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // privateKey
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // publicKey
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // scriptHash
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // wif
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // address
            cursor.getShort(offset + 7) != 0 // isMain
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Wallet entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setI(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setPrivateKey(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPublicKey(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setScriptHash(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setWif(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAddress(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setIsMain(cursor.getShort(offset + 7) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Wallet entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Wallet entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Wallet entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
