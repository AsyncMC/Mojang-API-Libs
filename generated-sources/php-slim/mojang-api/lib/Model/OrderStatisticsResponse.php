<?php
/**
 * OrderStatisticsResponse
 */
namespace OpenAPIServer\Model;

/**
 * OrderStatisticsResponse
 */
class OrderStatisticsResponse
{
    
    /** @var int $total total amount sold*/
    private $total;
    
    /** @var int $last24h total sold in last 24 hours*/
    private $last24h;
    
    /** @var double $saleVelocityPerSeconds decimal average sales per second*/
    private $saleVelocityPerSeconds;
}
