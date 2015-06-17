package de.fh_muenster.autovermietung;

import de.fh_muenster.autovermietung.exceptions.InvalidLoginException;
import de.fh_muenster.autovermietung.exceptions.NoSessionException;

/**
 * Created by Marian on 09.06.2015.
 */
public interface OnlineService {
    public Kunde login(String email, String password)
            throws InvalidLoginException;
    public void logout()
            throws NoSessionException;
}
