<?php

//replace with composer auto load - start
require_once("./contract/SalesOutputInterface.php");
//replace with composer auto load - start


/**
 * Created by PhpStorm.
 * User: sunil
 * Date: 2/14/2017
 * Time: 12:20 PM
 */

class SalesReport
{
    private $repo;

    public function __construct( salesRepository $repo )
    {
        $this->repo = $repo;
    }

    public function between( $fromDate, $toDate, SalesOutputInterface $formatter) {

        // Get sales information for date range
        $sales = $this->repo->between($fromDate, $toDate);

        return $output = $formatter->output($sales);
    }

}