/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.ejbdemo.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.tyaa.ejbdemo.entities.Student;

/**
 *
 * @author student
 */
@Stateless
public class StudentsFacade extends AbstractFacade<Student> {

    @PersistenceContext(unitName = "org.tyaa_EJBDemo-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentsFacade() {
        super(Student.class);
    }
    
}
