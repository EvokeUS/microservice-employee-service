/**
 * 
 */
package com.evoke.researchlabs.row.employee.restservice;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.evoke.researchlabs.row.Application;

/**
 * 
 * @author apandiri
 *
 */
@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
@TransactionConfiguration(defaultRollback = false)
@Transactional
public abstract class BaseTest {

}
