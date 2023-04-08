package net.devbase.jfreesteel;

import javax.smartcardio.Card;
import javax.smartcardio.CardException;

/**
 * Smart card wrapper for the third generation (2021-) Serbian eID card.
 * 
 * EidCardGemalto implements EidCard abstract interface for reading
 * data from the Serbian eID cards based on Gemalto MultiApp ID JavaCard that
 * are issued after Aug 18 2014.
 *
 * You should not initialize this class directly. Use EidCard.fromCard()
 * factory method for "direct" access, or initialize a Reader class and
 * assign the listener for the card insertion/removal events. The listener
 * will receive EidCard object when the card is inserted into the terminal.
 *
 * @author mbranko (mbranko@uns.ac.rs)
 * @author krstom (krstom@gmail.com)
 * @author Goran Rakic (grakic@devbase.net)
 */
@SuppressWarnings("restriction") // Various javax.smartcardio.*
public class EidCardSmartCafe extends EidCardGemalto {

    /** The list of known card ATRs, used to identify this smartcard. */
    public static final byte[] CARD_ATR = {
        (byte) 0x3B, (byte) 0xF9, (byte) 0x96, (byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0x31,
        (byte) 0xFE, (byte) 0x45, (byte) 0x53, (byte) 0x43, (byte) 0x45, (byte) 0x37, (byte) 0x20,
        (byte) 0x47, (byte) 0x43, (byte) 0x4E, (byte) 0x33, (byte) 0x5E
    };

    protected EidCardSmartCafe(Card card) throws CardException {
        super(card);
    }
}
