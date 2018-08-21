<?php

//replace with composer auto load - start
require_once ("./contract/DBConnection.php");
//replace with composer auto load - end


/**
 * Created by PhpStorm.
 * User: sunil
 * Date: 2/14/2017
 * Time: 11:59 AM
 */
class LoginController
{
    public $db;

    public function __construct( Connection $dbObject )
    {
        $this->db = $dbObject;
        // $dbObject - use this object to execute sql query.
    }

}