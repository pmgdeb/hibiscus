/**********************************************************************
 *
 * Copyright (c) 2004 Olaf Willuhn
 * All rights reserved.
 * 
 * This software is copyrighted work licensed under the terms of the
 * Jameica License.  Please consult the file "LICENSE" for details. 
 *
 **********************************************************************/
package de.willuhn.jameica.hbci.rmi;

import java.rmi.RemoteException;

/**
 * Interface fuer eine einzelne Buchung eines SEPA-Sammel-Transfers.
 * @param <T> der konkrete Typ des Sammel-Auftrages.
 */
public interface SepaSammelTransferBuchung<T extends SepaSammelTransfer> extends SepaBooking, HibiscusDBObject
{
	/**
	 * Liefert den zugeordneten Sammel-Transfer.
   * @return Sammel-Transfer.
   * @throws RemoteException
   */
  public T getSammelTransfer() throws RemoteException;

	/**
	 * Legt den zugehoerigen Sammel-Transfer fest.
   * @param s Sammel-Transfer.
   * @throws RemoteException
   */
  public void setSammelTransfer(T s) throws RemoteException;

	/**
	 * Speichert die Kontonummer des Gegenkontos.
   * @param kontonummer
   * @throws RemoteException
   */
  public void setGegenkontoNummer(String kontonummer) throws RemoteException;
	
	/**
	 * Speichert die BLZ des Gegenkontos.
   * @param blz
   * @throws RemoteException
   */
  public void setGegenkontoBLZ(String blz) throws RemoteException;

	/**
	 * Speichert den Namen des Kontoinhabers des Gegenkontos.
   * @param name
   * @throws RemoteException
   */
  public void setGegenkontoName(String name) throws RemoteException;

	/**
	 * Speichert den zu ueberweisenden Betrag.
	 * @param betrag Betrag.
	 * @throws RemoteException
	 */
	public void setBetrag(double betrag) throws RemoteException;
	
	/**
	 * Speichert den Zweck der Ueberweisung.
	 * @param zweck Zweck der Ueberweisung.
	 * @throws RemoteException
	 */
	public void setZweck(String zweck) throws RemoteException;
	
}
